package br.com.integracampeonatobrasileiro.hbnobj;
// Generated 22/02/2018 16:55:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Equipe generated by hbm2java
 */
public class Equipe  implements java.io.Serializable {


     private String cdEquipe;
     private String brEquipe;
     private String corEquipe;
     private String nmEquipe;
     private String nmComum;
     private String nmSlug;
     private String sgEquipe;
     private String tgEquipe;
     private String tpEquipe;
     private String uriEquipe;
     private Classificacao classificacao;
     private Classificacaopg classificacaopg;
     private Classificacaojogo classificacaojogo;
     private Set jogoidsForCdEquipe2 = new HashSet(0);
     private Classificacaoderrota classificacaoderrota;
     private Set jogoidsForCdEquipe1 = new HashSet(0);
     private Classificacaoempate classificacaoempate;
     private Classificacaovitoria classificacaovitoria;

    public Equipe() {
    }

	
    public Equipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }
    public Equipe(String cdEquipe, String brEquipe, String corEquipe, String nmEquipe, String nmComum, String nmSlug, String sgEquipe, String tgEquipe, String tpEquipe, String uriEquipe, Classificacao classificacao, Classificacaopg classificacaopg, Classificacaojogo classificacaojogo, Set jogoidsForCdEquipe2, Classificacaoderrota classificacaoderrota, Set jogoidsForCdEquipe1, Classificacaoempate classificacaoempate, Classificacaovitoria classificacaovitoria) {
       this.cdEquipe = cdEquipe;
       this.brEquipe = brEquipe;
       this.corEquipe = corEquipe;
       this.nmEquipe = nmEquipe;
       this.nmComum = nmComum;
       this.nmSlug = nmSlug;
       this.sgEquipe = sgEquipe;
       this.tgEquipe = tgEquipe;
       this.tpEquipe = tpEquipe;
       this.uriEquipe = uriEquipe;
       this.classificacao = classificacao;
       this.classificacaopg = classificacaopg;
       this.classificacaojogo = classificacaojogo;
       this.jogoidsForCdEquipe2 = jogoidsForCdEquipe2;
       this.classificacaoderrota = classificacaoderrota;
       this.jogoidsForCdEquipe1 = jogoidsForCdEquipe1;
       this.classificacaoempate = classificacaoempate;
       this.classificacaovitoria = classificacaovitoria;
    }
   
    public String getCdEquipe() {
        return this.cdEquipe;
    }
    
    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }
    public String getBrEquipe() {
        return this.brEquipe;
    }
    
    public void setBrEquipe(String brEquipe) {
        this.brEquipe = brEquipe;
    }
    public String getCorEquipe() {
        return this.corEquipe;
    }
    
    public void setCorEquipe(String corEquipe) {
        this.corEquipe = corEquipe;
    }
    public String getNmEquipe() {
        return this.nmEquipe;
    }
    
    public void setNmEquipe(String nmEquipe) {
        this.nmEquipe = nmEquipe;
    }
    public String getNmComum() {
        return this.nmComum;
    }
    
    public void setNmComum(String nmComum) {
        this.nmComum = nmComum;
    }
    public String getNmSlug() {
        return this.nmSlug;
    }
    
    public void setNmSlug(String nmSlug) {
        this.nmSlug = nmSlug;
    }
    public String getSgEquipe() {
        return this.sgEquipe;
    }
    
    public void setSgEquipe(String sgEquipe) {
        this.sgEquipe = sgEquipe;
    }
    public String getTgEquipe() {
        return this.tgEquipe;
    }
    
    public void setTgEquipe(String tgEquipe) {
        this.tgEquipe = tgEquipe;
    }
    public String getTpEquipe() {
        return this.tpEquipe;
    }
    
    public void setTpEquipe(String tpEquipe) {
        this.tpEquipe = tpEquipe;
    }
    public String getUriEquipe() {
        return this.uriEquipe;
    }
    
    public void setUriEquipe(String uriEquipe) {
        this.uriEquipe = uriEquipe;
    }
    public Classificacao getClassificacao() {
        return this.classificacao;
    }
    
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
    public Classificacaopg getClassificacaopg() {
        return this.classificacaopg;
    }
    
    public void setClassificacaopg(Classificacaopg classificacaopg) {
        this.classificacaopg = classificacaopg;
    }
    public Classificacaojogo getClassificacaojogo() {
        return this.classificacaojogo;
    }
    
    public void setClassificacaojogo(Classificacaojogo classificacaojogo) {
        this.classificacaojogo = classificacaojogo;
    }
    public Set getJogoidsForCdEquipe2() {
        return this.jogoidsForCdEquipe2;
    }
    
    public void setJogoidsForCdEquipe2(Set jogoidsForCdEquipe2) {
        this.jogoidsForCdEquipe2 = jogoidsForCdEquipe2;
    }
    public Classificacaoderrota getClassificacaoderrota() {
        return this.classificacaoderrota;
    }
    
    public void setClassificacaoderrota(Classificacaoderrota classificacaoderrota) {
        this.classificacaoderrota = classificacaoderrota;
    }
    public Set getJogoidsForCdEquipe1() {
        return this.jogoidsForCdEquipe1;
    }
    
    public void setJogoidsForCdEquipe1(Set jogoidsForCdEquipe1) {
        this.jogoidsForCdEquipe1 = jogoidsForCdEquipe1;
    }
    public Classificacaoempate getClassificacaoempate() {
        return this.classificacaoempate;
    }
    
    public void setClassificacaoempate(Classificacaoempate classificacaoempate) {
        this.classificacaoempate = classificacaoempate;
    }
    public Classificacaovitoria getClassificacaovitoria() {
        return this.classificacaovitoria;
    }
    
    public void setClassificacaovitoria(Classificacaovitoria classificacaovitoria) {
        this.classificacaovitoria = classificacaovitoria;
    }




}

