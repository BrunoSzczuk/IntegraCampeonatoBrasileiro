/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.obj;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bruno.szczuk
 */
@Embeddable
public class JogoPK implements Serializable{
    @Column(name = "cd_jogo")
    private int id;

    public JogoPK(int id) {
        this.id = id;
    }

    public JogoPK() {
    }

    @Override
    public String toString() {
        return "JogoPK{" + "id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
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
        final JogoPK other = (JogoPK) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
