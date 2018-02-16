package br.com.wsintegrabolao.dao;

import br.com.wsintegrabolao.obj.Classificacao_DE;
import br.com.wsintegrabolao.obj.Classificacao_EM;
import br.com.wsintegrabolao.obj.Classificacao_JG;
import br.com.wsintegrabolao.obj.Classificacao_PG;
import br.com.wsintegrabolao.obj.Classificacao_VT;
import br.com.wsintegrabolao.obj.Equipe;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClassificacaoDAO.class)
public abstract class ClassificacaoDAO_ {

	public static volatile SingularAttribute<ClassificacaoDAO, String> pos;
	public static volatile SingularAttribute<ClassificacaoDAO, Classificacao_EM> empate;
	public static volatile SingularAttribute<ClassificacaoDAO, Integer> golsContra;
	public static volatile SingularAttribute<ClassificacaoDAO, String> ganho_pos;
	public static volatile SingularAttribute<ClassificacaoDAO, Float> aproveitamento;
	public static volatile SingularAttribute<ClassificacaoDAO, Classificacao_PG> pontosGols;
	public static volatile SingularAttribute<ClassificacaoDAO, Integer> saldoGols;
	public static volatile SingularAttribute<ClassificacaoDAO, Integer> golsPro;
	public static volatile SingularAttribute<ClassificacaoDAO, Equipe> equipe;
	public static volatile SingularAttribute<ClassificacaoDAO, Classificacao_VT> vitoria;
	public static volatile SingularAttribute<ClassificacaoDAO, Classificacao_JG> jogos;
	public static volatile SingularAttribute<ClassificacaoDAO, Classificacao_DE> derrota;

}

