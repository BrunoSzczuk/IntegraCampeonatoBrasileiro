/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracamponeatobrasileiro.cliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author bruno.szczuk
 */
public class ConexaoWS {

    public static String getJsonBolao(String ano) {
        String retorno = "";
        try {
            URL url = new URL("http://jsuol.com.br/c/monaco/utils/gestor/commons.js?callback=simulador_dados_jsonp&file=commons.uol.com.br/sistemas/esporte/modalidades/futebol/campeonatos/dados/" + ano + "/30/dados.json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            while (br.ready()) {
                retorno += br.readLine();
            }
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cleanUpJsonBOM(retorno.substring(22, retorno.length()));
    }

    private static String cleanUpJsonBOM(String json) {
        return json.trim().replaceFirst("\ufeff", "");
    }

}
