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
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.jogoId);
        hash = 53 * hash + Objects.hashCode(this.data);
        hash = 53 * hash + Objects.hashCode(this.rodada);
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
        final JogoList other = (JogoList) obj;
        if (!Objects.equals(this.jogoId, other.jogoId)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.rodada, other.rodada)) {
            return false;
        }
        return true;
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
