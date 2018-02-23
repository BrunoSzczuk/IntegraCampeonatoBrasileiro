/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

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
}
