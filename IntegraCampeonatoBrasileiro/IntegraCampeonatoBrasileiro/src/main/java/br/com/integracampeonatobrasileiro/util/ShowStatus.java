/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.util;

import java.util.Calendar;

/**
 *
 * @author bruno.szczuk
 */
public class ShowStatus {
      public static void Show(String status) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime() + " - " + status );
    }

}
