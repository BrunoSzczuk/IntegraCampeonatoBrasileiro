
CREATE TABLE public.rodada (
                cd_rodada INTEGER NOT NULL,
                CONSTRAINT rodada_pk PRIMARY KEY (cd_rodada)
);


CREATE SEQUENCE public.parametros_cd_parametro_seq;

CREATE TABLE public.parametros (
                cd_parametro INTEGER NOT NULL DEFAULT nextval('public.parametros_cd_parametro_seq'),
                nm_parametro VARCHAR(60) NOT NULL,
                cd_usuario BIGINT,
                vl_parametro VARCHAR,
                ds_parametro VARCHAR NOT NULL,
                CONSTRAINT parametros_pk PRIMARY KEY (cd_parametro)
);
COMMENT ON COLUMN public.parametros.cd_usuario IS 'nao obrigatorio';


ALTER SEQUENCE public.parametros_cd_parametro_seq OWNED BY public.parametros.cd_parametro;

CREATE TABLE public.schedule (
                cd_relatorio VARCHAR(10) NOT NULL,
                nm_relatorio VARCHAR(60),
                ds_email VARCHAR,
                CONSTRAINT schedule_pk PRIMARY KEY (cd_relatorio)
);
COMMENT ON COLUMN public.schedule.ds_email IS 'campo com e-mail de destinatarios fixos';


CREATE SEQUENCE public.tipousuario_cd_tipo_seq;

CREATE TABLE public.tipousuario (
                cd_tipo INTEGER NOT NULL DEFAULT nextval('public.tipousuario_cd_tipo_seq'),
                ds_tipo VARCHAR(60) NOT NULL,
                CONSTRAINT tipousuario_pk PRIMARY KEY (cd_tipo)
);


ALTER SEQUENCE public.tipousuario_cd_tipo_seq OWNED BY public.tipousuario.cd_tipo;

CREATE TABLE public.usuario (
                cd_usuario VARCHAR(20) NOT NULL,
                st_ativo BOOLEAN DEFAULT false NOT NULL,
                nm_usuario VARCHAR(100) NOT NULL,
                sn_usuario VARCHAR(140) NOT NULL,
                ds_email VARCHAR(80) NOT NULL,
                nr_pontuacao NUMERIC(15,2),
                dt_nascimento DATE,
                dt_cadastro TIMESTAMP DEFAULT current_timestamp NOT NULL,
                cd_tipo INTEGER NOT NULL,
                CONSTRAINT usuario_pk PRIMARY KEY (cd_usuario)
);


CREATE SEQUENCE public.erro_cd_erro_seq;

CREATE TABLE public.erro (
                cd_erro INTEGER NOT NULL DEFAULT nextval('public.erro_cd_erro_seq'),
                cd_usuario VARCHAR(20) NOT NULL,
                dt_erro DATE DEFAULT current_date NOT NULL,
                CONSTRAINT erro_pk PRIMARY KEY (cd_erro)
);


ALTER SEQUENCE public.erro_cd_erro_seq OWNED BY public.erro.cd_erro;

CREATE SEQUENCE public.bolao_cd_bolao_seq;

CREATE TABLE public.bolao (
                cd_bolao BIGINT NOT NULL DEFAULT nextval('public.bolao_cd_bolao_seq'),
                ds_bolao VARCHAR(50) NOT NULL,
                st_ativo BOOLEAN DEFAULT true NOT NULL,
                dt_anobolao INTEGER,
                qt_usuarios INTEGER,
                cd_responsavel VARCHAR(20),
                CONSTRAINT bolao_pk PRIMARY KEY (cd_bolao)
);


ALTER SEQUENCE public.bolao_cd_bolao_seq OWNED BY public.bolao.cd_bolao;

CREATE TABLE public.bolaousuario (
                cd_bolao BIGINT NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                dt_insercao TIMESTAMP DEFAULT current_timestamp NOT NULL,
                CONSTRAINT bolaousuario_pk PRIMARY KEY (cd_bolao, cd_usuario)
);


CREATE TABLE public.estatisticausuario (
                cd_rodada INTEGER NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                pc_acertocheio NUMERIC(5,2),
                pc_erro NUMERIC(5,2),
                CONSTRAINT estatisticausuario_pk PRIMARY KEY (cd_rodada, cd_usuario)
);


CREATE TABLE public.posicaousuario (
                cd_usuario VARCHAR(20) NOT NULL,
                nr_sobedesce INTEGER,
                nr_posicao INTEGER NOT NULL,
                CONSTRAINT posicaousuario_pk PRIMARY KEY (cd_usuario)
);
COMMENT ON COLUMN public.posicaousuario.nr_sobedesce IS 'mostrar as posições que subiu ou desceu no ranking';


CREATE SEQUENCE public.sugestao_nr_sugestao_seq;

CREATE TABLE public.sugestao (
                nr_sugestao BIGINT NOT NULL DEFAULT nextval('public.sugestao_nr_sugestao_seq'),
                ds_sugestao VARCHAR NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                dt_sugestao TIMESTAMP DEFAULT current_timestamp NOT NULL,
                CONSTRAINT sugestao_pk PRIMARY KEY (nr_sugestao)
);


ALTER SEQUENCE public.sugestao_nr_sugestao_seq OWNED BY public.sugestao.nr_sugestao;

CREATE SEQUENCE public.acesso_cd_acesso_seq;

CREATE TABLE public.acesso (
                cd_acesso BIGINT NOT NULL DEFAULT nextval('public.acesso_cd_acesso_seq'),
                nr_ipconexao VARCHAR(20),
                dt_acesso TIMESTAMP DEFAULT current_timestamp NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                CONSTRAINT acesso_pk PRIMARY KEY (cd_acesso)
);


ALTER SEQUENCE public.acesso_cd_acesso_seq OWNED BY public.acesso.cd_acesso;

CREATE TABLE public.equipe (
                cd_equipe VARCHAR(10) NOT NULL,
                br_equipe VARCHAR(100),
                cor_equipe VARCHAR(100),
                nm_equipe VARCHAR(100),
                nm_comum VARCHAR(100),
                nm_slug VARCHAR(100),
                sg_equipe VARCHAR(10),
                tg_equipe VARCHAR(100),
                tp_equipe VARCHAR(100),
                uri_equipe VARCHAR(100),
                CONSTRAINT equipe_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.jogoid (
                cd_jogo INTEGER NOT NULL,
                st_classificougolsfora BOOLEAN,
                dt_jogo DATE,
                dsp_time1 VARCHAR(2),
                dsp_time2 VARCHAR(2),
                st_eliminoujogovolta BOOLEAN,
                ds_estadio VARCHAR(100),
                hr_jogo VARCHAR(15),
                ds_local VARCHAR(100),
                nr_jogo VARCHAR(5),
                pl_penalti1 VARCHAR(5),
                pl_penalti2 VARCHAR(5),
                pl_time1 VARCHAR(5),
                pl_time2 VARCHAR(5),
                ps_jogo VARCHAR(5),
                nr_rodada VARCHAR(10),
                url_posjogo VARCHAR(255),
                url_prejogo VARCHAR(255),
                url_video VARCHAR(255),
                cd_equipe1 VARCHAR(10) NOT NULL,
                cd_equipe2 VARCHAR(10) NOT NULL,
                CONSTRAINT jogoid_pkey PRIMARY KEY (cd_jogo)
);


CREATE TABLE public.palpite (
                cd_jogo INTEGER NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                cd_bolao BIGINT NOT NULL,
                nr_gols1 INTEGER NOT NULL,
                dt_aposta TIMESTAMP DEFAULT current_timestamp NOT NULL,
                dt_ultimaatt TIMESTAMP DEFAULT current_timestamp,
                nr_gols2 INTEGER NOT NULL,
                st_palpite VARCHAR,
                CONSTRAINT palpite_pk PRIMARY KEY (cd_jogo, cd_usuario, cd_bolao)
);
COMMENT ON COLUMN public.palpite.st_palpite IS 'A - Aberto, F - Fechado';


CREATE TABLE public.resultadopalpite (
                cd_jogo INTEGER NOT NULL,
                cd_usuario VARCHAR(20) NOT NULL,
                cd_bolao BIGINT NOT NULL,
                qt_acertounico INTEGER,
                qt_pontos INTEGER,
                qt_acerto INTEGER,
                qt_erro INTEGER,
                CONSTRAINT resultadopalpite_pk PRIMARY KEY (cd_jogo, cd_usuario, cd_bolao)
);
COMMENT ON COLUMN public.resultadopalpite.qt_acertounico IS 'quantidade de acerto de gols de apenas um time';


CREATE TABLE public.rodadajogos (
                cd_jogo INTEGER NOT NULL,
                cd_rodada INTEGER NOT NULL,
                CONSTRAINT rodadajogos_pkey PRIMARY KEY (cd_jogo, cd_rodada)
);


CREATE TABLE public.datajogos (
                data TIMESTAMP NOT NULL,
                cd_jogo INTEGER NOT NULL,
                CONSTRAINT datajogos_pkey PRIMARY KEY (data, cd_jogo)
);


CREATE TABLE public.classificacaovitoria (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaovitoria_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.classificacaopg (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaopg_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.classificacaojogo (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaojogo_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.classificacaoempate (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaoempate_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.classificacaoderrota (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaoderrota_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE public.classificacao (
                cd_equipe VARCHAR(10) NOT NULL,
                pc_aproveitamento REAL,
                ga_posicao VARCHAR(3),
                go_contra INTEGER,
                go_pro INTEGER,
                ps_equipe VARCHAR(3),
                sd_gols INTEGER,
                CONSTRAINT classificacao_pkey PRIMARY KEY (cd_equipe)
);


ALTER TABLE public.rodadajogos ADD CONSTRAINT rodada_rodadajogos_fk
FOREIGN KEY (cd_rodada)
REFERENCES public.rodada (cd_rodada)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.estatisticausuario ADD CONSTRAINT rodada_estatisticausuario_fk
FOREIGN KEY (cd_rodada)
REFERENCES public.rodada (cd_rodada)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.usuario ADD CONSTRAINT tipousuario_usuario_fk
FOREIGN KEY (cd_tipo)
REFERENCES public.tipousuario (cd_tipo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.acesso ADD CONSTRAINT usuario_acesso_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.sugestao ADD CONSTRAINT usuario_sugestao_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.palpite ADD CONSTRAINT usuario_palpite_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.posicaousuario ADD CONSTRAINT usuario_posicaousuario_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.estatisticausuario ADD CONSTRAINT usuario_estatisticausuario_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.bolaousuario ADD CONSTRAINT usuario_bolausuario_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.bolao ADD CONSTRAINT usuario_bolao_fk
FOREIGN KEY (cd_responsavel)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.erro ADD CONSTRAINT usuario_erro_fk
FOREIGN KEY (cd_usuario)
REFERENCES public.usuario (cd_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.palpite ADD CONSTRAINT bolao_palpite_fk
FOREIGN KEY (cd_bolao)
REFERENCES public.bolao (cd_bolao)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.bolaousuario ADD CONSTRAINT bolao_bolausuario_fk
FOREIGN KEY (cd_bolao)
REFERENCES public.bolao (cd_bolao)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacaopg ADD CONSTRAINT equipe_classificacaopg_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.jogoid ADD CONSTRAINT equipe_jogoid_fk
FOREIGN KEY (cd_equipe1)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.jogoid ADD CONSTRAINT equipe_jogoid_fk1
FOREIGN KEY (cd_equipe2)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacaovitoria ADD CONSTRAINT equipe_classificacaovitoria_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacaojogo ADD CONSTRAINT equipe_classificacaojogo_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacaoderrota ADD CONSTRAINT equipe_classificacaoderrota_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacao ADD CONSTRAINT equipe_classificacao_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.classificacaoempate ADD CONSTRAINT equipe_classificacaoempate_fk
FOREIGN KEY (cd_equipe)
REFERENCES public.equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.datajogos ADD CONSTRAINT jogoid_datajogos_fk
FOREIGN KEY (cd_jogo)
REFERENCES public.jogoid (cd_jogo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.rodadajogos ADD CONSTRAINT jogoid_rodadajogos_fk
FOREIGN KEY (cd_jogo)
REFERENCES public.jogoid (cd_jogo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.palpite ADD CONSTRAINT jogoid_palpite_fk
FOREIGN KEY (cd_jogo)
REFERENCES public.jogoid (cd_jogo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.resultadopalpite ADD CONSTRAINT palpite_resultadopalpite_fk
FOREIGN KEY (cd_jogo, cd_usuario, cd_bolao)
REFERENCES public.palpite (cd_jogo, cd_usuario, cd_bolao)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
