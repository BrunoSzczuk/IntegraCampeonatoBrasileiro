/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.equipe);
        hash = 67 * hash + Objects.hashCode(this.data);
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
        final Jogo_dataPK other = (Jogo_dataPK) obj;
        if (!Objects.equals(this.equipe, other.equipe)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    
}
