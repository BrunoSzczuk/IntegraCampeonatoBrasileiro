/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bruno.szczuk
 */
@Embeddable
public class Jogo_dataPK implements Serializable {
    private JogoPK equipe;

    @Column(name = "data")
    private Date data;

    @Override
    public String toString() {
        return "Jogo_dataPK{" + "equipe=" + equipe + ", data=" + data + '}';
    }

    public Jogo_dataPK(JogoPK equipe, Date data) {
        this.equipe = equipe;
        this.data = data;
    }

    public Jogo_dataPK() {
    }

    public JogoPK getEquipe() {
        return equipe;
    }

    public void setEquipe(JogoPK equipe) {
        this.equipe = equipe;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
