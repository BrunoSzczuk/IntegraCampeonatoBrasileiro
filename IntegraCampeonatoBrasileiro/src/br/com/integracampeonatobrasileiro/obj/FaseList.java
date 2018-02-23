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
public class FaseList {
    @JsonProperty("fases")
    private Map<Integer, Fase> fase;

    @Override
    public String toString() {
        return "FaseList{" + "fase=" + fase + '}';
    }

    public Map<Integer, Fase> getFase() {
        return fase;
    }

    public FaseList() {
    }

    public FaseList(Map<Integer, Fase> fase) {
        this.fase = fase;
    }


}
