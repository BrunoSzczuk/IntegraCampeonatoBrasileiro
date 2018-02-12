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
    public String toString() {
        return "Classificacao_SG{" + "total=" + total + '}';
    }

}
