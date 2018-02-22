
CREATE TABLE equipe (
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


CREATE TABLE jogoid (
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


CREATE TABLE rodadajogos (
                cd_rodada INTEGER NOT NULL,
                cd_jogo INTEGER NOT NULL,
                CONSTRAINT rodadajogos_pkey PRIMARY KEY (cd_rodada, cd_jogo)
);


CREATE TABLE datajogos (
                data TIMESTAMP NOT NULL,
                cd_jogo INTEGER NOT NULL,
                CONSTRAINT datajogos_pkey PRIMARY KEY (data, cd_jogo)
);


CREATE TABLE classificacaovitoria (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaovitoria_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE classificacaopg (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaopg_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE classificacaojogo (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaojogo_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE classificacaoempate (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaoempate_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE classificacaoderrota (
                cd_equipe VARCHAR(10) NOT NULL,
                qt_mandante INTEGER,
                qt_total INTEGER,
                qt_visitante INTEGER,
                CONSTRAINT classificacaoderrota_pkey PRIMARY KEY (cd_equipe)
);


CREATE TABLE classificacao (
                cd_equipe VARCHAR(10) NOT NULL,
                pc_aproveitamento REAL,
                ga_posicao VARCHAR(3),
                go_contra INTEGER,
                go_pro INTEGER,
                ps_equipe VARCHAR(3),
                sd_gols INTEGER,
                CONSTRAINT classificacao_pkey PRIMARY KEY (cd_equipe)
);


ALTER TABLE classificacaopg ADD CONSTRAINT equipe_classificacaopg_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE jogoid ADD CONSTRAINT equipe_jogoid_fk
FOREIGN KEY (cd_equipe1)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE jogoid ADD CONSTRAINT equipe_jogoid_fk1
FOREIGN KEY (cd_equipe2)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE classificacaovitoria ADD CONSTRAINT equipe_classificacaovitoria_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE classificacaojogo ADD CONSTRAINT equipe_classificacaojogo_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE classificacaoderrota ADD CONSTRAINT equipe_classificacaoderrota_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE classificacao ADD CONSTRAINT equipe_classificacao_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE classificacaoempate ADD CONSTRAINT equipe_classificacaoempate_fk
FOREIGN KEY (cd_equipe)
REFERENCES equipe (cd_equipe)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE datajogos ADD CONSTRAINT jogoid_datajogos_fk
FOREIGN KEY (cd_jogo)
REFERENCES jogoid (cd_jogo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE rodadajogos ADD CONSTRAINT jogoid_rodadajogos_fk
FOREIGN KEY (cd_jogo)
REFERENCES jogoid (cd_jogo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
