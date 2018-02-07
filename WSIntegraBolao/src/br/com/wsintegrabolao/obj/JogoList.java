    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Bruno
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JogoList implements Serializable{
           
    @JsonProperty("id")
    private Map<Integer, Jogo_id> jogoId;
    
    /* Implementar o restante das budegas
    
    @JsonProperty("data")
    private Map<Date, Jogos_Data> data;

    public Map<Date, Jogos_Data> getData() {
        return data;
    }*/

    @Override
    public String toString() {
        return "JogoList{" + "jogo_id=" + jogoId;
    }
    
    
    public JogoList() {
    }

    public Map<Integer, Jogo_id> getJogo() {
        return jogoId;
    }
    
}
