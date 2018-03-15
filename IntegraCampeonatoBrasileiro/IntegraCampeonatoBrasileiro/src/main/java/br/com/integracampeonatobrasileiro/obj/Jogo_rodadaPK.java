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
 * @author Bruno
 */
@Embeddable
public class Jogo_rodadaPK implements Serializable {

    @Column(name = "cd_rodada")
    private RodadaPK rodada;

    @Column(name = "cd_jogo")
    private JogoPK jogo;

    public Jogo_rodadaPK() {
    }

    public RodadaPK getRodada() {
        return rodada;
    }

    public void setRodada(RodadaPK rodada) {
        this.rodada = rodada;
    }

    @Override
    public String toString() {
        return "Jogo_rodadaPK{" + "rodada=" + rodada + ", jogo=" + jogo + '}';
    }

    public JogoPK getJogo() {
        return jogo;
    }

    public void setJogo(JogoPK jogo) {
        this.jogo = jogo;
    }

    public Jogo_rodadaPK(RodadaPK rodada, JogoPK jogo) {
        this.rodada = rodada;
        this.jogo = jogo;
    }

}
