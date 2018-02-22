package br.com.integracampeonatobrasileiro.hbnobj;
// Generated 22/02/2018 16:55:34 by Hibernate Tools 4.3.1



/**
 * Classificacao generated by hbm2java
 */
public class Classificacao  implements java.io.Serializable {


     private String cdEquipe;
     private Equipe equipe;
     private Float pcAproveitamento;
     private String gaPosicao;
     private Integer goContra;
     private Integer goPro;
     private String psEquipe;
     private Integer sdGols;

    public Classificacao() {
    }

	
    public Classificacao(Equipe equipe) {
        this.equipe = equipe;
    }
    public Classificacao(Equipe equipe, Float pcAproveitamento, String gaPosicao, Integer goContra, Integer goPro, String psEquipe, Integer sdGols) {
       this.equipe = equipe;
       this.pcAproveitamento = pcAproveitamento;
       this.gaPosicao = gaPosicao;
       this.goContra = goContra;
       this.goPro = goPro;
       this.psEquipe = psEquipe;
       this.sdGols = sdGols;
    }
   
    public String getCdEquipe() {
        return this.cdEquipe;
    }
    
    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }
    public Equipe getEquipe() {
        return this.equipe;
    }
    
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    public Float getPcAproveitamento() {
        return this.pcAproveitamento;
    }
    
    public void setPcAproveitamento(Float pcAproveitamento) {
        this.pcAproveitamento = pcAproveitamento;
    }
    public String getGaPosicao() {
        return this.gaPosicao;
    }
    
    public void setGaPosicao(String gaPosicao) {
        this.gaPosicao = gaPosicao;
    }
    public Integer getGoContra() {
        return this.goContra;
    }
    
    public void setGoContra(Integer goContra) {
        this.goContra = goContra;
    }
    public Integer getGoPro() {
        return this.goPro;
    }
    
    public void setGoPro(Integer goPro) {
        this.goPro = goPro;
    }
    public String getPsEquipe() {
        return this.psEquipe;
    }
    
    public void setPsEquipe(String psEquipe) {
        this.psEquipe = psEquipe;
    }
    public Integer getSdGols() {
        return this.sdGols;
    }
    
    public void setSdGols(Integer sdGols) {
        this.sdGols = sdGols;
    }




}

