/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties (ignoreUnknown = true)
public class Classificacao_equipeList implements Serializable{

    @JsonProperty("equipe")
    private Map<Integer, Classificacao_equipe> data;

    @Override
    public String toString() {
        return "Classificacao_equipeList{" + "data=" + data + '}';
    }

    public Map<Integer, Classificacao_equipe> getData() {
        return data;
    }

    public void setData(Map<Integer, Classificacao_equipe> data) {
        this.data = data;
    }
    
       
    
}
