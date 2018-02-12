/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classificacao_DE implements Serializable{
    @JsonProperty("total")
    private int total;
    
    @JsonProperty("mandante")
    private int mandante;
    
    @JsonProperty("visitante")
    private int visitante;

    public int getTotal() {
        return total;
    }

    public Classificacao_DE(int total, int mandante, int visitante) {
        this.total = total;
        this.mandante = mandante;
        this.visitante = visitante;
    }

    public Classificacao_DE() {
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMandante() {
        return mandante;
    }

    public void setMandante(int mandante) {
        this.mandante = mandante;
    }

    public int getVisitante() {
        return visitante;
    }

    public void setVisitante(int visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Classificacao_DE{" + "total=" + total + ", mandante=" + mandante + ", visitante=" + visitante + '}';
    }

    
}
