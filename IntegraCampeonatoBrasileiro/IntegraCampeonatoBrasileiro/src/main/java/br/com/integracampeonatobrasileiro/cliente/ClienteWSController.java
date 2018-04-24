/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.cliente;

import br.com.integracampeonatobrasileiro.obj.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author bruno.szczuk
 */
public class ClienteWSController {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static Collection<Equipe> buscaEquipe(String json) {
        ArrayList<Equipe> equipes = new ArrayList<>();
        try {
            EquipeList lista = mapper.readValue(json, EquipeList.class);
            equipes = new ArrayList<>(lista.getEquipe().values());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return equipes;
    }

    public static Collection<Jogo_id> buscaJogo(String json) {
        ArrayList<Jogo_id> jogos = new ArrayList<>();
        try {
            JogoList lista = mapper.readValue(json, JogoList.class);
            jogos = new ArrayList<>(lista.getJogo().values());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jogos;
    }

    public static Collection<Fase> buscaFase(String json) {
        ArrayList<Fase> fases = new ArrayList<>();
        try {
            FaseList lista = mapper.readValue(json, FaseList.class);
            fases = new ArrayList<>(lista.getFase().values());
            //Pegar o ID do Jogo_ID
            for (Object key : fases.get(0).getJogos().getJogo().keySet()) {
                fases.get(0).getJogos().getJogo().get(key).setId(new JogoPK((int) key));
            }
            //Pegar a data do Jogo_data
            for (Object key : fases.get(0).getJogos().getData().keySet()) {
                for (Jogo_data j : fases.get(0).getJogos().getData().get(key)) {
                    j.setPk(new Jogo_dataPK(j.getPk().getEquipe(), (Date) key));
                }
            }
            //Pegar a rodada do Jogo_rodada
            for (Object key : fases.get(0).getJogos().getRodada().keySet()) {
                for (Jogo_rodada r : fases.get(0).getJogos().getRodada().get(key)) {
                    r.setPk(new Jogo_rodadaPK(new RodadaPK((int)key) ,r.getPk().getJogo()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fases;
    }
    
    public static Competicao buscaCompeticao(String json){
        Competicao c = new Competicao();
        try {
            c = mapper.readValue(json, Competicao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
