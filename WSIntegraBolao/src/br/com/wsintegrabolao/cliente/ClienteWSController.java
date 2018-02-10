/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.cliente;

import br.com.wsintegrabolao.obj.Equipe;
import br.com.wsintegrabolao.obj.EquipeList;
import br.com.wsintegrabolao.obj.Fase;
import br.com.wsintegrabolao.obj.FaseList;
import br.com.wsintegrabolao.obj.Jogo_id;
import br.com.wsintegrabolao.obj.JogoList;
import br.com.wsintegrabolao.obj.JogoPK;
import br.com.wsintegrabolao.obj.Jogo_data;
import br.com.wsintegrabolao.obj.Jogo_dataPK;
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
                for (Jogo_data j : fases.get(0).getJogos().getData().get(key)){
                    j.setPk(new Jogo_dataPK(j.getPk().getEquipe(), (Date)key));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fases;
    }
}
