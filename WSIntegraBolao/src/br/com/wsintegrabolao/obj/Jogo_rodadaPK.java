/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wsintegrabolao.obj;

import java.io.Serializable;
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
    
}
