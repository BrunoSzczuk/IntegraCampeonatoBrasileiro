/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author bruno.szczuk
 */
public class Classificacao_SG implements Serializable {

    @JsonProperty("total")
    private int total;

    public int getTotal() {
        return total;
    }

    public Classificacao_SG() {
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.total;
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
        final Classificacao_SG other = (Classificacao_SG) obj;
        if (this.total != other.total) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Classificacao_SG{" + "total=" + total + '}';
    }

}
