package br.com.integracampeonatobrasileiro.obj;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nome-completo",
    "status",
    "tag",
    "id",
    "temporada",
    "nome-comum"
})
@Entity
@Table(name = "competicao")
public class Competicao implements Serializable {

    @JsonProperty("nome-completo")
    @Column(name = "nm_completo")
    private String nomeCompleto;

    @Column(name = "st_andamento")
    @JsonProperty("status")
    private String status;

    @Column(name = "tag_campeonato")
    @JsonProperty("tag")
    private String tag;

    @Id
    @Column(name = "cd_campeonato")
    @JsonProperty("id")
    private String id;

    @Column(name = "ano_temporada")
    @JsonProperty("temporada")
    private String temporada;

    @JsonProperty("nome-comum")
    @Column(name = "nm_comum")
    private String nomeComum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3653605831506480060L;

    /**
     * No args constructor for use in serialization
     *     
*/
    public Competicao() {
    }

    /**
     *
     * @param id
     * @param status
     * @param nomeCompleto
     * @param temporada
     * @param tag
     * @param nomeComum
     */
    public Competicao(String nomeCompleto, String status, String tag, String id, String temporada, String nomeComum) {
        super();
        this.nomeCompleto = nomeCompleto;
        this.status = status;
        this.tag = tag;
        this.id = id;
        this.temporada = temporada;
        this.nomeComum = nomeComum;
    }

    @JsonProperty("nome-completo")
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @JsonProperty("nome-completo")
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Competicao withNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Competicao{" + "nomeCompleto=" + nomeCompleto + ", status=" + status + ", tag=" + tag + ", id=" + id + ", temporada=" + temporada + ", nomeComum=" + nomeComum + ", additionalProperties=" + additionalProperties + '}';
    }
    

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Competicao withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Competicao withTag(String tag) {
        this.tag = tag;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Competicao withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("temporada")
    public String getTemporada() {
        return temporada;
    }

    @JsonProperty("temporada")
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Competicao withTemporada(String temporada) {
        this.temporada = temporada;
        return this;
    }

    @JsonProperty("nome-comum")
    public String getNomeComum() {
        return nomeComum;
    }

    @JsonProperty("nome-comum")
    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public Competicao withNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Competicao withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
