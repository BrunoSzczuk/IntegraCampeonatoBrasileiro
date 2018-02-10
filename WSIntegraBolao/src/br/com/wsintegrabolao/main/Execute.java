/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.main;

import br.com.wsintegrabolao.cliente.ClienteWSController;
import br.com.wsintegrabolao.cliente.ConexaoWS;
import br.com.wsintegrabolao.dao.ConexaoDAO;
import br.com.wsintegrabolao.obj.*;
import br.com.wsintegrabolao.util.ShowStatus;
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
        loadJogo(json);
        loadData(json);
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
            ShowStatus.Show("Erro: br.com.wsintegrabolao.main.Execute.loadJogo " + e.getMessage());
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
            ShowStatus.Show("Erro: br.com.wsintegrabolao.main.Execute.loadData " + e.getMessage());
        }
    }
}
