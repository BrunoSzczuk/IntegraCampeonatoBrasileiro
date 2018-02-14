/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author bruno.szczuk
 */
public class Classificacao_GC implements Serializable{
    @JsonProperty("total")
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Classificacao_GC() {
    }

    @Override
    public String toString() {
        return "Classificacao_GC{" + "total=" + total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.total;
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
        final Classificacao_GC other = (Classificacao_GC) obj;
        if (this.total != other.total) {
            return false;
        }
        return true;
    }
    
    
    
    
}
