/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

/**
 *
 * @author bruno.szczuk
 */
@Embeddable
public class JogoPK implements Serializable{
    @Column(name = "cd_jogo")
    @GeneratedValue
    private int id;

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
    
    
}
