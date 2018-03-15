/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.obj;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bruno.szczuk
 */
@Embeddable
public class RodadaPK implements Serializable{
    
    @Column(name = "cd_rodada")
    private int cdRodada;

    public RodadaPK() {
    }

    public int getCdRodada() {
        return cdRodada;
    }

    public void setCdRodada(int cdRodada) {
        this.cdRodada = cdRodada;
    }

    @Override
    public String toString() {
        return "Rodada{" + "cdRodada=" + cdRodada + '}';
    }

    public RodadaPK(int cdRodada) {
        this.cdRodada = cdRodada;
    }
}
