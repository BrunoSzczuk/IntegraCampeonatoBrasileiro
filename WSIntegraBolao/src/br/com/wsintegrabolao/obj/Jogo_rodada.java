/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wsintegrabolao.obj;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "rodadajogos")
public class Jogo_rodada implements Serializable{
    
    @EmbeddedId
    private Jogo_rodadaPK pk;

    public Jogo_rodada(String jogo){
        this.pk =  new Jogo_rodadaPK(new JogoPK(Integer.parseInt(jogo)), 0);
    }

    @Override
    public String toString() {
        return "Jogo_rodada{" + "pk=" + pk + '}';
    }

    public Jogo_rodadaPK getPk() {
        return pk;
    }

    public void setPk(Jogo_rodadaPK pk) {
        this.pk = pk;
    }

    public Jogo_rodada() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.pk);
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
        final Jogo_rodada other = (Jogo_rodada) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }
    
}
