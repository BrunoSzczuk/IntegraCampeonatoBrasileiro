    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Bruno
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JogoList implements Serializable{
           
    @JsonProperty("id")
    private Map<Integer, Jogo_id> jogoId;   
    
    @JsonProperty("data")
    private Map<Date, Jogo_data[]> data;

    @JsonProperty("rodada")
    private Map<Integer, Jogo_rodada[]> rodada;

    public Map<Integer, Jogo_rodada[]> getRodada() {
        return rodada;
    }

    public void setRodada(Map<Integer, Jogo_rodada[]> rodada) {
        this.rodada = rodada;
    }

    @Override
    public String toString() {
        return "JogoList{" + "jogoId=" + jogoId + ", data=" + data + ", rodada=" + rodada + '}';
    }
    
    
    public JogoList() {
    }

    public Map<Integer, Jogo_id> getJogo() {
        return jogoId;
    }

    public Map<Integer, Jogo_id> getJogoId() {
        return jogoId;
    }

    public void setJogoId(Map<Integer, Jogo_id> jogoId) {
        this.jogoId = jogoId;
    }
    
    public Map<Date, Jogo_data[]>getData() {
        return data;
    }
}
