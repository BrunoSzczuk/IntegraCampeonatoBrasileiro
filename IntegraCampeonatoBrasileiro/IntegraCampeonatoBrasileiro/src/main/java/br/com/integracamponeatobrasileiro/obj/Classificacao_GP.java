/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;


/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classificacao_GP implements Serializable{
    
    @JsonProperty("total")
    private int total;

    public Classificacao_GP(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Classificacao_GP() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.total;
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
        final Classificacao_GP other = (Classificacao_GP) obj;
        if (this.total != other.total) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classificacao_GP{" + "total=" + total + '}';
    }

    
    
    
    
}
