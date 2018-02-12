/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author bruno.szczuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classificacao_equipe implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("pos")
    private String pos;

    @JsonProperty("ganho-pos")
    private String ganho_pos;

    @JsonProperty("pg")
    private Classificacao_PG pontosGols;

    @JsonProperty("j")
    private Classificacao_JG jogos;

    @JsonProperty("v")
    private Classificacao_VT vitoria;

    @JsonProperty("e")
    private Classificacao_EM empate;

    @JsonProperty("d")
    private Classificacao_DE derrota;

    @JsonProperty("gp")
    private Classificacao_GP golsPro;

    @JsonProperty("gc")
    private Classificacao_GC golsContra;

    @JsonProperty("sg")
    private Classificacao_SG saldoGols;
    
    @JsonProperty("cd")
    private int cd;

    @JsonProperty("ap")
    private float aproveitamento;

    public Classificacao_equipe() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Classificacao_equipe{" + "id=" + id + ", pos=" + pos + ", ganho_pos=" + ganho_pos + ", pontosGols=" + pontosGols + ", jogos=" + jogos + ", vitoria=" + vitoria + ", empate=" + empate + ", derrota=" + derrota + ", golsPro=" + golsPro + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols + ", cd=" + cd + ", aproveitamento=" + aproveitamento + '}';
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getGanho_pos() {
        return ganho_pos;
    }

    public void setGanho_pos(String ganho_pos) {
        this.ganho_pos = ganho_pos;
    }

    public Classificacao_PG getPontosGols() {
        return pontosGols;
    }

    public void setPontosGols(Classificacao_PG pontosGols) {
        this.pontosGols = pontosGols;
    }

    public Classificacao_JG getJogos() {
        return jogos;
    }

    public void setJogos(Classificacao_JG jogos) {
        this.jogos = jogos;
    }

    public Classificacao_VT getVitoria() {
        return vitoria;
    }

    public void setVitoria(Classificacao_VT vitoria) {
        this.vitoria = vitoria;
    }

    public Classificacao_EM getEmpate() {
        return empate;
    }

    public void setEmpate(Classificacao_EM empate) {
        this.empate = empate;
    }

    public Classificacao_DE getDerrota() {
        return derrota;
    }

    public void setDerrota(Classificacao_DE derrota) {
        this.derrota = derrota;
    }

    public Classificacao_GP getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(Classificacao_GP golsPro) {
        this.golsPro = golsPro;
    }

    public Classificacao_GC getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(Classificacao_GC golsContra) {
        this.golsContra = golsContra;
    }

    public Classificacao_SG getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(Classificacao_SG saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public float getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(float aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

}
