/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bruno.szczuk
 */
@Entity
@Table(name = "datajogos")
public class Jogo_data implements Serializable {

    @EmbeddedId
    private Jogo_dataPK pk;

    @Override
    public String toString() {
        return "Jogo_data{" + "pk=" + pk + '}';
    }

    public Jogo_data(Jogo_dataPK pk) {
        this.pk = pk;
    }

    public Jogo_data() {
    }

    public Jogo_dataPK getPk() {
        return pk;
    }

    public Jogo_data(String equipe){
        this.pk = new Jogo_dataPK(new JogoPK(Integer.parseInt(equipe)), null);
    }

    public void setPk(Jogo_dataPK pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.pk);
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
        final Jogo_data other = (Jogo_data) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    
}
