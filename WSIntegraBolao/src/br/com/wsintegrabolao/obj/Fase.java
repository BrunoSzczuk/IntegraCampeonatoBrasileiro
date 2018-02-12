/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fase {
    @JsonProperty("jogos")
    private JogoList jogos;

    @JsonProperty("id")
    private String id;

    @JsonProperty("classificacao")
    private Classificacao_equipeList classificacao;
    
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fase{" + "jogos=" + jogos + ", id=" + id + ", classificacao=" + classificacao + '}';
    }

    public Classificacao_equipeList getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao_equipeList classificacao) {
        this.classificacao = classificacao;
    }


    public JogoList getJogos() {
        return jogos;
    }

    public String getId() {
        return id;
    }
    
    
    
    public void setJogos(JogoList jogos) {
        this.jogos = jogos;
    }
    
}
