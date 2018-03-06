/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.integracampeonatobrasileiro.obj;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Bruno
 */
@Embeddable
public class Jogo_rodadaPK implements Serializable{
    
    @Column(name = "cd_rodada")
    private int id;

    public Jogo_rodadaPK() {
    }

    public Jogo_rodadaPK(JogoPK jogo, int id) {
        this.id = id;
        this.jogo = jogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JogoPK getJogo() {
        return jogo;
    }

    public void setJogo(JogoPK jogo) {
        this.jogo = jogo;
    }

    @Override
    public String toString() {
        return "Jogo_rodadaPK{" + "id=" + id + ", jogo=" + jogo + '}';
    }
    
    private JogoPK jogo;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.jogo);
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
        final Jogo_rodadaPK other = (Jogo_rodadaPK) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.jogo, other.jogo)) {
            return false;
        }
        return true;
    }
    
    
}
