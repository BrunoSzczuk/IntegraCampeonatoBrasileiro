/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.integracampeonatobrasileiro.dao;

import br.com.integracampeonatobrasileiro.obj.Classificacao_equipe;
import br.com.integracampeonatobrasileiro.obj.Classificacao_EM;
import br.com.integracampeonatobrasileiro.obj.Classificacao_DE;
import br.com.integracampeonatobrasileiro.obj.Classificacao_PG;
import br.com.integracampeonatobrasileiro.obj.Classificacao_JG;
import br.com.integracampeonatobrasileiro.obj.Equipe;
import br.com.integracampeonatobrasileiro.obj.Classificacao_VT;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "classificacao")
public class ClassificacaoDAO implements Serializable {

    @Column(name = "go_pro")
    private int golsPro;

    @OneToOne
    @JoinColumn(name = "cd_equipe")
    private Equipe equipe;
    
    @Id
    @Column(name = "cd_equipe")
    private String cdEquipe;

    public Equipe getEquipe() {
        return equipe;
    }

    public String getCdEquipe() {
        return cdEquipe;
    }

    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Column(name = "go_contra")
    private int golsContra;

    @Column(name = "sd_gols")
    private int saldoGols;

    @Column(name = "ps_equipe")
    private String pos;

    @Column(name = "ga_posicao")
    private String ganho_pos;

    @OneToOne(mappedBy = "cdEquipe")
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacao_PG pontosGols;

    @OneToOne(mappedBy = "cdEquipe")
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacao_JG jogos;

    @OneToOne(mappedBy = "cdEquipe")
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacao_VT vitoria;

    @OneToOne(mappedBy = "cdEquipe")
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacao_EM empate;

    @OneToOne(mappedBy = "cdEquipe")
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe", insertable = true, updatable = true)
    private Classificacao_DE derrota;

    @Column(name = "pc_aproveitamento")
    private float aproveitamento;

    public ClassificacaoDAO() {
    }

    public ClassificacaoDAO(Classificacao_equipe eq) {
        this.aproveitamento = eq.getAproveitamento();
        this.equipe = IntegraCamponeatoBrasileiroController.buscaEquipe(eq.getId());
        this.cdEquipe = equipe.getId();
        this.derrota = eq.getDerrota();
        this.empate = eq.getEmpate();
        this.ganho_pos = eq.getGanho_pos();
        this.golsContra = eq.getGolsContra().getTotal();
        this.golsPro = eq.getGolsPro().getTotal();
        this.jogos = eq.getJogos();
        this.pontosGols = eq.getPontosGols();
        this.pos = eq.getPos();
        this.saldoGols = eq.getSaldoGols().getTotal();
        this.vitoria = eq.getVitoria();
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public String getPos() {
        return pos;
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

    public float getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(float aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    @Override
    public String toString() {
        return "ClassificacaoDAO{" + "golsPro=" + golsPro + ", equipe=" + equipe + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols + ", pos=" + pos + ", ganho_pos=" + ganho_pos + ", pontosGols=" + pontosGols + ", jogos=" + jogos + ", vitoria=" + vitoria + ", empate=" + empate + ", derrota=" + derrota + ", aproveitamento=" + aproveitamento + '}';
    }

}
