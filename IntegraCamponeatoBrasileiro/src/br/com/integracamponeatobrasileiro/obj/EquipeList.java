/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquipeList {

    @JsonProperty("equipes")
    private Map<Integer, Equipe> equipe;

    @Override
    public String toString() {
        return "ListEquipe{" + "Equipe=" + equipe + '}';
    }

    public Map<Integer, Equipe> getEquipe() {
        return equipe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.equipe);
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
        final EquipeList other = (EquipeList) obj;
        if (!Objects.equals(this.equipe, other.equipe)) {
            return false;
        }
        return true;
    }
    
}
