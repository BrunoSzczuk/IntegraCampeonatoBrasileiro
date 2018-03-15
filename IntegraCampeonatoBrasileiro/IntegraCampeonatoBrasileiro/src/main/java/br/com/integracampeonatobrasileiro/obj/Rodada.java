/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.obj;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bruno.szczuk
 */
@Entity
@Table(name = "rodada")

public class Rodada implements Serializable {
    @EmbeddedId
    private RodadaPK pk;

    public Rodada() {
    }

    
    public Rodada(RodadaPK pk) {
        this.pk = pk;
    }

    public RodadaPK getPk() {
        return pk;
    }

    public void setPk(RodadaPK pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "Rodada{" + "pk=" + pk + '}';
    }
    
    
    
    
}
