/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.dao;

import br.com.integracampeonatobrasileiro.obj.Equipe;

/**
 *
 * @author bruno.szczuk
 */
public class IntegraCamponeatoBrasileiroController {

    public static Equipe buscaEquipe(String cdEquipe) {
        return ConexaoDAO.getInstance().getEm().find(Equipe.class, cdEquipe);
    }
}
