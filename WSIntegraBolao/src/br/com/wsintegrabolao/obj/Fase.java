/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.jogos);
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.classificacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fase other = (Fase) obj;
        if (!Objects.equals(this.jogos, other.jogos)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.classificacao, other.classificacao)) {
            return false;
        }
        return true;
    }
    
    
    
    public void setJogos(JogoList jogos) {
        this.jogos = jogos;
    }
    
}
