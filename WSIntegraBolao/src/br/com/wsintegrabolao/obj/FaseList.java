/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.fase);
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
        final FaseList other = (FaseList) obj;
        if (!Objects.equals(this.fase, other.fase)) {
            return false;
        }
        return true;
    }


}
