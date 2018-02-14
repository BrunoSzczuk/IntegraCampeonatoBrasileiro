/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "classificacaovitoria")
public class Classificacao_VT implements Serializable {

    @JsonProperty("total")
    @Column(name = "qt_total")
    private int total;

    @JsonIgnore
    @Id
    @ManyToOne
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe")
    private Equipe cdEquipe;
    
    @JsonProperty("mandante")
    @Column(name = "qt_mandante")
    private int mandante;

    @JsonProperty("visitante")
    @Column(name = "qt_visitante")
    private int visitante;

    public Classificacao_VT() {
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Classificacao_VT{" + "total=" + total + ", mandante=" + mandante + ", visitante=" + visitante + '}';
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

}
