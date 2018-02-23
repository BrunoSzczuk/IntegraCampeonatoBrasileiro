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
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Collection;

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
    
    public static Collection<Fase> buscaFase(String json){
        ArrayList<Fase> fases = new ArrayList<>();
        try {
            FaseList lista = mapper.readValue(json, FaseList.class);
            fases = new ArrayList<>(lista.getFase().values());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fases;
    }
}
