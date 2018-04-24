/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.main;

import br.com.integracampeonatobrasileiro.obj.*;
import br.com.integracampeonatobrasileiro.cliente.ClienteWSController;
import br.com.integracampeonatobrasileiro.cliente.ConexaoWS;
import br.com.integracampeonatobrasileiro.dao.ClassificacaoDAO;
import br.com.integracampeonatobrasileiro.dao.ConexaoDAO;
import br.com.integracampeonatobrasileiro.dao.IntegraCamponeatoBrasileiroController;
import br.com.integracampeonatobrasileiro.util.ShowStatus;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bruno.szczuk
 */
public class Execute {

    private static final String ANO = "2018";

    public static void main(String[] args) {
        String json = ConexaoWS.getJsonBolao(ANO);
        loadEquipe(json);
        loadRodada(json);
        loadJogo(json);
        loadData(json);
        loadRodadaJogos(json);
        loadClassificacao(json);
        loadCompeticao(json);
        System.exit(0);
    }

    private static void loadEquipe(String json) {
        ShowStatus.Show("************************************");
        ShowStatus.Show("**     Atualização de Equipes    ***");
        ShowStatus.Show("************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {
            conn.startTransaction();
            ArrayList<Equipe> lista = new ArrayList<>(ClienteWSController.buscaEquipe(json));
            for (Equipe eq : lista) {
                ShowStatus.Show(eq.toString());
                conn.persist(eq);
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        }
        ShowStatus.Show("Equipes salvas com sucesso");
    }

    private static void loadJogo(String json) {
        ShowStatus.Show("************************************");
        ShowStatus.Show("**      Atualização de Jogos     ***");
        ShowStatus.Show("************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {
            conn.startTransaction();
            ArrayList<Fase> fase = new ArrayList<>(ClienteWSController.buscaFase(json));
            ArrayList<Jogo_id> jogos = new ArrayList<>(fase.get(0).getJogos().getJogo().values());
            for (Jogo_id j : jogos) {
                ShowStatus.Show(j.toString());
                conn.persist(j);
            }
            conn.commit();
            ShowStatus.Show("Jogos salvos com sucesso");
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
            ShowStatus.Show("Erro: br.com.integracamponeatobrasileiro.main.Execute.loadJogo " + e.getMessage());
        }
    }

    private static void loadData(String json) {
        ShowStatus.Show("****************************************");
        ShowStatus.Show("**   Atualização de Datas dos Jogos  ***");
        ShowStatus.Show("****************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {
            conn.startTransaction();
            ArrayList<Fase> fase = new ArrayList<>(ClienteWSController.buscaFase(json));
            ArrayList<Jogo_data[]> datas = new ArrayList<>(fase.get(0).getJogos().getData().values());
            for (Jogo_data[] d : datas) {
                ShowStatus.Show(Arrays.toString(d));
                for (Jogo_data jogo : d) {
                    conn.persist(jogo);
                }
            }
            conn.commit();
            ShowStatus.Show("Datas dos Jogos salvos com sucesso");
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
            ShowStatus.Show("Erro: br.com.integracamponeatobrasileiro.main.Execute.loadData " + e.getMessage());
        }
    }

    public static void loadRodadaJogos(String json) {
        ShowStatus.Show("****************************************");
        ShowStatus.Show("**   Atualização de Rodada dos Jogos  ***");
        ShowStatus.Show("****************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {
            ArrayList<Fase> fase = new ArrayList<>(ClienteWSController.buscaFase(json));
            ArrayList<Jogo_rodada[]> jogosrodadas = new ArrayList<>(fase.get(0).getJogos().getRodada().values());
            conn.startTransaction();
            for (Jogo_rodada[] r : jogosrodadas) {                
                ShowStatus.Show(Arrays.toString(r));
                for (Jogo_rodada rd : r) {
                    
                    conn.persist(rd);
                }
            }
            conn.commit();
            ShowStatus.Show("rodada dos Jogos salvos com sucesso");
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
            ShowStatus.Show("Erro: br.com.integracamponeatobrasileiro.main.Execute.loadRodada " + e.getMessage());
        }
    }

    private static void loadClassificacao(String json) {
        ShowStatus.Show("****************************************");
        ShowStatus.Show("**   Atualização de Classificacao    ***");
        ShowStatus.Show("****************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {

            ArrayList<Fase> fase = new ArrayList<>(ClienteWSController.buscaFase(json));
            ArrayList<Classificacao_equipe> classificacao = new ArrayList<>(fase.get(0).getClassificacao().getData().values());
            for (Classificacao_equipe cl : classificacao) {
                conn.startTransaction();
                ClassificacaoDAO c = new ClassificacaoDAO(cl);
                Equipe e = IntegraCamponeatoBrasileiroController.buscaEquipe(cl.getId());

                c.getDerrota().setCdEquipe(e);
                c.getDerrota().setId(c.getDerrota().getCdEquipe().getId());

                c.getEmpate().setCdEquipe(e);
                c.getEmpate().setId(c.getEmpate().getCdEquipe().getId());

                c.getJogos().setCdEquipe(e);
                c.getJogos().setId(c.getJogos().getCdEquipe().getId());

                c.getPontosGols().setCdEquipe(e);
                c.getPontosGols().setId(c.getPontosGols().getCdEquipe().getId());

                c.getVitoria().setCdEquipe(e);
                c.getVitoria().setId(c.getVitoria().getCdEquipe().getId());

                ShowStatus.Show(c.toString());
                conn.persist(c);
                conn.persist(c.getDerrota());
                conn.persist(c.getEmpate());
                conn.persist(c.getJogos());
                conn.persist(c.getPontosGols());
                conn.persist(c.getVitoria());
                conn.commit();
            }

            ShowStatus.Show("Classificacao dos Jogos salvos com sucesso");
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
            ShowStatus.Show("Erro: br.com.integracamponeatobrasileiro.main.Execute.loadClassificacao " + e.getMessage());
        }
    }

    private static void loadRodada(String json) {
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {

            conn.startTransaction();
            ArrayList<Fase> fase = new ArrayList<>(ClienteWSController.buscaFase(json));
            ArrayList<Jogo_rodada[]> jogosrodadas = new ArrayList<>(fase.get(0).getJogos().getRodada().values());
            for (Jogo_rodada[] r : jogosrodadas) {
                Rodada rodada = new Rodada(new RodadaPK(r[0].getPk().getRodada().getCdRodada()));
                // System.out.println(rodada);
                conn.persist(rodada);

            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
            ShowStatus.Show("Erro: br.com.integracamponeatobrasileiro.main.Execute.loadRodada " + e.getMessage());
        }
    }
    
    public static void loadCompeticao(String json){
        ShowStatus.Show("************************************");
        ShowStatus.Show("**     Atualização de Competicao    ***");
        ShowStatus.Show("************************************");
        ConexaoDAO conn = ConexaoDAO.getInstance();
        try {
            conn.startTransaction();
            
            Competicao c = ClienteWSController.buscaCompeticao(json);
            ShowStatus.Show(c.toString());
            conn.persist(c);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        }
        ShowStatus.Show("Competicao salva com sucesso");
    }

}
