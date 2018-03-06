package br.com.integracampeonatobrasileiro.obj;

import br.com.integracampeonatobrasileiro.dao.ClassificacaoDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "nome",
    "nome-comum",
    "nome-slug",
    "sigla",
    "tag",
    "tipo",
    "uri",
    "brasao",
    "cor"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "equipe")
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e"),
    @NamedQuery(name = "Equipe.findByid", query = "SELECT e FROM Equipe e WHERE e.id = :id"),
    @NamedQuery(name = "Equipe.findBynome", query = "SELECT e FROM Equipe e WHERE e.nome =:nome"),
    @NamedQuery(name = "Equipe.findBynome_comum", query = "SELECT e FROM Equipe e WHERE e.nome_comum =:nome_comum"),
    @NamedQuery(name = "Equipe.findBynome_slug", query = "SELECT e FROM Equipe e WHERE e.nome_slug = :nome_slug"),
    @NamedQuery(name = "Equipe.findBysigla", query = "SELECT e FROM Equipe e WHERE e.sigla = :sigla"),
    @NamedQuery(name = "Equipe.findBytag", query = "SELECT e FROM Equipe e WHERE e.tag = :tag"),
    @NamedQuery(name = "Equipe.findBytipo", query = "SELECT e FROM Equipe e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Equipe.findByuri", query = "SELECT e FROM Equipe e WHERE e.uri = :uri"),
    @NamedQuery(name = "Equipe.findBybrasao", query = "SELECT e FROM Equipe e WHERE e.brasao = :brasao"),
    @NamedQuery(name = "Equipe.findBycor", query = "SELECT e FROM Equipe e WHERE e.cor = :cor")})

public class Equipe implements Serializable {

    @Override
    public String toString() {
        return "Equipe{" + "id=" + id + ", nome=" + nome + ", nome_comum=" + nome_comum + ", nome_slug=" + nome_slug + ", sigla=" + sigla + ", tag=" + tag + ", tipo=" + tipo + ", uri=" + uri + ", brasao=" + brasao + ", cor=" + cor + '}';
    }

    @JsonProperty("id")
    @Id
    @Column(name = "cd_equipe")
    private String id;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinColumn(name = "cd_equipe", referencedColumnName = "cd_equipe")
    private ClassificacaoDAO classificacao;
    
    @JsonProperty("nome")
    @Column(name = "nm_equipe")
    private String nome;

    @JsonProperty("nome-comum")
    @Column(name = "nm_comum")
    private String nome_comum;

    @JsonProperty("nome-slug")
    @Column(name = "nm_slug")
    private String nome_slug;

    @JsonProperty("sigla")
    @Column(name = "sg_equipe")
    private String sigla;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.nome_comum);
        hash = 17 * hash + Objects.hashCode(this.nome_slug);
        hash = 17 * hash + Objects.hashCode(this.sigla);
        hash = 17 * hash + Objects.hashCode(this.tag);
        hash = 17 * hash + Objects.hashCode(this.tipo);
        hash = 17 * hash + Objects.hashCode(this.uri);
        hash = 17 * hash + Objects.hashCode(this.brasao);
        hash = 17 * hash + Objects.hashCode(this.cor);
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
        final Equipe other = (Equipe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nome_comum, other.nome_comum)) {
            return false;
        }
        if (!Objects.equals(this.nome_slug, other.nome_slug)) {
            return false;
        }
        if (!Objects.equals(this.sigla, other.sigla)) {
            return false;
        }
        if (!Objects.equals(this.tag, other.tag)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.uri, other.uri)) {
            return false;
        }
        if (!Objects.equals(this.brasao, other.brasao)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return true;
    }

    @JsonProperty("tag")
    @Column(name = "tg_equipe")
    private String tag;

    @JsonProperty("tipo")
    @Column(name = "tp_equipe")
    private String tipo;

    @JsonProperty("uri")
    @Column(name = "uri_equipe")
    private String uri;

    @JsonProperty("brasao")
    @Column(name = "br_equipe")
    private String brasao;

    @JsonProperty("cor")
    @Column(name = "cor_equipe")
    private String cor;

    /**
     * No args constructor for use in serialization
     *     
*/
    public Equipe() {
    }

    /**
     *
     * @param id
     * @param cor
     * @param sigla
     * @param tag
     * @param tipo
     * @param brasao
     * @param nome
     * @param nome_slug
     * @param uri
     * @param nome_comum
     */
    public Equipe(String id, String nome, String nome_comum, String nome_slug, String sigla, String tag, String tipo, String uri, String brasao, String cor) {
        super();
        this.id = id;
        this.nome = nome;
        this.nome_comum = nome_comum;
        this.nome_slug = nome_slug;
        this.sigla = sigla;
        this.tag = tag;
        this.tipo = tipo;
        this.uri = uri;
        this.brasao = brasao;
        this.cor = cor;
    }
    
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("nome-comum")
    public String getNome_comum() {
        return nome_comum;
    }

    @JsonProperty("nome-comum")
    public void setNome_comum(String nome_comum) {
        this.nome_comum = nome_comum;
    }

    @JsonProperty("nome-slug")
    public String getNome_slug() {
        return nome_slug;
    }

    @JsonProperty("nome-slug")
    public void setNome_slug(String nome_slug) {
        this.nome_slug = nome_slug;
    }

    @JsonProperty("sigla")
    public String getSigla() {
        return sigla;
    }

    @JsonProperty("sigla")
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("brasao")
    public String getBrasao() {
        return brasao;
    }

    @JsonProperty("brasao")
    public void setBrasao(String brasao) {
        this.brasao = brasao;
    }

    @JsonProperty("cor")
    public String getCor() {
        return cor;
    }

    @JsonProperty("cor")
    public void setCor(String cor) {
        this.cor = cor;
    }

    public ClassificacaoDAO getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(ClassificacaoDAO classificacao) {
        this.classificacao = classificacao;
    }

}
