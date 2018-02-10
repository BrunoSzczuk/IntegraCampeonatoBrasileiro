package br.com.wsintegrabolao.obj;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "posicao",
    "njogo",
    "rodada",
    "data",
    "horario",
    "time1",
    "time2",
    "placar1",
    "placar2",
    "penalti1",
    "penalti2",
    "desempate_time1",
    "desempate_time2",
    "estadio",
    "estadio_id",
    "local",
    "url-prejogo",
    "url-posjogo",
    "url-video",
    "eliminou-jogo-volta",
    "classificou-gols-fora"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "jogoid")
public class Jogo_id implements Serializable{

    @EmbeddedId
    @JsonIgnore
    @Column(name = "cd_jogo")
    private JogoPK id;

    public JogoPK getId() {
        return id;
    }

    public Jogo_id(JogoPK id) {
        this.id = id;
    }

    public void setId(JogoPK id) {
        this.id = id;
    }
    
    @JsonProperty("posicao")
    @Column(name = "ps_jogo")
    private String posicao;
    
    @JsonProperty("njogo")
    @Column(name = "nr_jogo")
    private String njogo;
    
    @JsonProperty("rodada")
    @Column(name = "nr_rodada")
    private String rodada;
    
    @JsonProperty("data")
    @Column(name = "dt_jogo")
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @JsonProperty("horario")
    @Column(name = "hr_jogo")
    private String horario;
    
    @JsonProperty("time1")
    @Column(name = "cd_time1")
    private String time1;
    
    @JsonProperty("time2")
    @Column(name = "cd_time2")
    private String time2;
    
    @JsonProperty("placar1")
    @Column(name = "pl_time1")
    private String placar1;
    
    @JsonProperty("placar2")
    @Column(name = "pl_time2")
    private String placar2;
    
    @JsonProperty("penalti1")
    @Column(name = "pl_penalti1")
    private String penalti1;
    
    @JsonProperty("penalti2")
    @Column(name = "pl_penalti2")
    private String penalti2;
    
    @JsonProperty("desempate_time1")
    @Column(name = "dsp_time1")
    private String desempateTime1;
    
    @JsonProperty("desempate_time2")
    @Column(name = "dsp_time2")
    private String desempateTime2;
    
    @JsonProperty("estadio")
    @Column(name = "ds_estadio")
    private String estadio;
    
    @JsonProperty("estadio_id")
    @Column(name = "cd_estadio")
    private String estadioId;
    
    @JsonProperty("local")
    @Column(name = "ds_local")
    private String local;
    
    @JsonProperty("url-prejogo")
    @Column(name = "url_prejogo")
    private String urlPrejogo;
    
    @JsonProperty("url-posjogo")
    @Column(name = "url_posjogo")
    private String urlPosjogo;
    
    @JsonProperty("url-video")
    @Column(name = "url_video")
    private String urlVideo;
    
    @JsonProperty("eliminou-jogo-volta")
    @Column(name = "st_eliminoujogovolta")
    private boolean eliminouJogoVolta;
    
    @JsonProperty("classificou-gols-fora")
    @Column(name = "st_classificougolsfora")
    private boolean classificouGolsFora;

    /**
     * No args constructor for use in serialization
     *     
*/
    public Jogo_id() {
    }

    /**
     *
     * @param classificouGolsFora
     * @param horario
     * @param placar1
     * @param eliminouJogoVolta
     * @param placar2
     * @param estadio
     * @param rodada
     * @param data
     * @param urlVideo
     * @param desempateTime1
     * @param desempateTime2
     * @param njogo
     * @param posicao
     * @param time2
     * @param urlPosjogo
     * @param time1
     * @param estadioId
     * @param penalti2
     * @param penalti1
     * @param local
     * @param urlPrejogo
     */
    public Jogo_id(String posicao, String njogo, String rodada, Date data, String horario, String time1, String time2, String placar1, String placar2, String penalti1, String penalti2, String desempateTime1, String desempateTime2, String estadio, String estadioId, String local, String urlPrejogo, String urlPosjogo, String urlVideo, boolean eliminouJogoVolta, boolean classificouGolsFora) {
        super();
        this.posicao = posicao;
        this.njogo = njogo;
        this.rodada = rodada;
        this.data = data;
        this.horario = horario;
        this.time1 = time1;
        this.time2 = time2;
        this.placar1 = placar1;
        this.placar2 = placar2;
        this.penalti1 = penalti1;
        this.penalti2 = penalti2;
        this.desempateTime1 = desempateTime1;
        this.desempateTime2 = desempateTime2;
        this.estadio = estadio;
        this.estadioId = estadioId;
        this.local = local;
        this.urlPrejogo = urlPrejogo;
        this.urlPosjogo = urlPosjogo;
        this.urlVideo = urlVideo;
        this.eliminouJogoVolta = eliminouJogoVolta;
        this.classificouGolsFora = classificouGolsFora;
    }

    @JsonProperty("posicao")
    public String getPosicao() {
        return posicao;
    }

    @JsonProperty("posicao")
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Jogo_id withPosicao(String posicao) {
        this.posicao = posicao;
        return this;
    }

    @JsonProperty("njogo")
    public String getNjogo() {
        return njogo;
    }

    @JsonProperty("njogo")
    public void setNjogo(String njogo) {
        this.njogo = njogo;
    }

    public Jogo_id withNjogo(String njogo) {
        this.njogo = njogo;
        return this;
    }

    @JsonProperty("rodada")
    public String getRodada() {
        return rodada;
    }

    @JsonProperty("rodada")
    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public Jogo_id withRodada(String rodada) {
        this.rodada = rodada;
        return this;
    }

    @JsonProperty("data")
    public Date getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Date data) {
        this.data = data;
    }

    public Jogo_id withData(Date data) {
        this.data = data;
        return this;
    }

    @JsonProperty("horario")
    public String getHorario() {
        return horario;
    }

    @JsonProperty("horario")
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Jogo_id withHorario(String horario) {
        this.horario = horario;
        return this;
    }

    @JsonProperty("time1")
    public String getTime1() {
        return time1;
    }

    @JsonProperty("time1")
    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public Jogo_id withTime1(String time1) {
        this.time1 = time1;
        return this;
    }

    @JsonProperty("time2")
    public String getTime2() {
        return time2;
    }

    @JsonProperty("time2")
    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public Jogo_id withTime2(String time2) {
        this.time2 = time2;
        return this;
    }

    @JsonProperty("placar1")
    public String getPlacar1() {
        return placar1;
    }

    @JsonProperty("placar1")
    public void setPlacar1(String placar1) {
        this.placar1 = placar1;
    }

    public Jogo_id withPlacar1(String placar1) {
        this.placar1 = placar1;
        return this;
    }

    @JsonProperty("placar2")
    public String getPlacar2() {
        return placar2;
    }

    @JsonProperty("placar2")
    public void setPlacar2(String placar2) {
        this.placar2 = placar2;
    }

    public Jogo_id withPlacar2(String placar2) {
        this.placar2 = placar2;
        return this;
    }

    @JsonProperty("penalti1")
    public Object getPenalti1() {
        return penalti1;
    }

    @JsonProperty("penalti1")
    public void setPenalti1(String penalti1) {
        this.penalti1 = penalti1;
    }

    public Jogo_id withPenalti1(String penalti1) {
        this.penalti1 = penalti1;
        return this;
    }

    @JsonProperty("penalti2")
    public Object getPenalti2() {
        return penalti2;
    }

    @JsonProperty("penalti2")
    public void setPenalti2(String penalti2) {
        this.penalti2 = penalti2;
    }

    public Jogo_id withPenalti2(String penalti2) {
        this.penalti2 = penalti2;
        return this;
    }

    @JsonProperty("desempate_time1")
    public String getDesempateTime1() {
        return desempateTime1;
    }

    @JsonProperty("desempate_time1")
    public void setDesempateTime1(String desempateTime1) {
        this.desempateTime1 = desempateTime1;
    }

    public Jogo_id withDesempateTime1(String desempateTime1) {
        this.desempateTime1 = desempateTime1;
        return this;
    }

    @JsonProperty("desempate_time2")
    public String getDesempateTime2() {
        return desempateTime2;
    }

    @JsonProperty("desempate_time2")
    public void setDesempateTime2(String desempateTime2) {
        this.desempateTime2 = desempateTime2;
    }

    public Jogo_id withDesempateTime2(String desempateTime2) {
        this.desempateTime2 = desempateTime2;
        return this;
    }

    @JsonProperty("estadio")
    public String getEstadio() {
        return estadio;
    }

    @JsonProperty("estadio")
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Jogo_id withEstadio(String estadio) {
        this.estadio = estadio;
        return this;
    }

    @JsonProperty("estadio_id")
    public String getEstadioId() {
        return estadioId;
    }

    @JsonProperty("estadio_id")
    public void setEstadioId(String estadioId) {
        this.estadioId = estadioId;
    }

    public Jogo_id withEstadioId(String estadioId) {
        this.estadioId = estadioId;
        return this;
    }

    @JsonProperty("local")
    public String getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(String local) {
        this.local = local;
    }

    public Jogo_id withLocal(String local) {
        this.local = local;
        return this;
    }

    @JsonProperty("url-prejogo")
    public String getUrlPrejogo() {
        return urlPrejogo;
    }

    @JsonProperty("url-prejogo")
    public void setUrlPrejogo(String urlPrejogo) {
        this.urlPrejogo = urlPrejogo;
    }

    public Jogo_id withUrlPrejogo(String urlPrejogo) {
        this.urlPrejogo = urlPrejogo;
        return this;
    }

    @JsonProperty("url-posjogo")
    public String getUrlPosjogo() {
        return urlPosjogo;
    }

    @JsonProperty("url-posjogo")
    public void setUrlPosjogo(String urlPosjogo) {
        this.urlPosjogo = urlPosjogo;
    }

    public Jogo_id withUrlPosjogo(String urlPosjogo) {
        this.urlPosjogo = urlPosjogo;
        return this;
    }

    @JsonProperty("url-video")
    public String getUrlVideo() {
        return urlVideo;
    }

    @JsonProperty("url-video")
    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Jogo_id withUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
        return this;
    }

    @JsonProperty("eliminou-jogo-volta")
    public boolean isEliminouJogoVolta() {
        return eliminouJogoVolta;
    }

    @JsonProperty("eliminou-jogo-volta")
    public void setEliminouJogoVolta(boolean eliminouJogoVolta) {
        this.eliminouJogoVolta = eliminouJogoVolta;
    }

    public Jogo_id withEliminouJogoVolta(boolean eliminouJogoVolta) {
        this.eliminouJogoVolta = eliminouJogoVolta;
        return this;
    }

    @JsonProperty("classificou-gols-fora")
    public boolean isClassificouGolsFora() {
        return classificouGolsFora;
    }

    @JsonProperty("classificou-gols-fora")
    public void setClassificouGolsFora(boolean classificouGolsFora) {
        this.classificouGolsFora = classificouGolsFora;
    }

    public Jogo_id withClassificouGolsFora(boolean classificouGolsFora) {
        this.classificouGolsFora = classificouGolsFora;
        return this;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("posicao", posicao).append("njogo", njogo).append("rodada", rodada).append("data", data).append("horario", horario).append("time1", time1).append("time2", time2).append("placar1", placar1).append("placar2", placar2).append("penalti1", penalti1).append("penalti2", penalti2).append("desempateTime1", desempateTime1).append("desempateTime2", desempateTime2).append("estadio", estadio).append("estadioId", estadioId).append("local", local).append("urlPrejogo", urlPrejogo).append("urlPosjogo", urlPosjogo).append("urlVideo", urlVideo).append("eliminouJogoVolta", eliminouJogoVolta).append("classificouGolsFora", classificouGolsFora).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(classificouGolsFora).append(horario).append(placar1).append(eliminouJogoVolta).append(placar2).append(estadio).append(rodada).append(data).append(urlVideo).append(desempateTime1).append(desempateTime2).append(njogo).append(time2).append(posicao).append(urlPosjogo).append(estadioId).append(penalti2).append(penalti1).append(local).append(urlPrejogo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Jogo_id) == false) {
            return false;
        }
        Jogo_id rhs = ((Jogo_id) other);
        return new EqualsBuilder().append(classificouGolsFora, rhs.classificouGolsFora).append(horario, rhs.horario).append(placar1, rhs.placar1).append(eliminouJogoVolta, rhs.eliminouJogoVolta).append(placar2, rhs.placar2).append(estadio, rhs.estadio).append(rodada, rhs.rodada).append(data, rhs.data).append(urlVideo, rhs.urlVideo).append(desempateTime1, rhs.desempateTime1).append(desempateTime2, rhs.desempateTime2).append(njogo, rhs.njogo).append(time2, rhs.time2).append(posicao, rhs.posicao).append(urlPosjogo, rhs.urlPosjogo).append(time1, rhs.time1).append(estadioId, rhs.estadioId).append(penalti2, rhs.penalti2).append(penalti1, rhs.penalti1).append(local, rhs.local).append(urlPrejogo, rhs.urlPrejogo).isEquals();
    }

}
