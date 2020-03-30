-- Cria��o das Tabelas --

CREATE TABLE pessoa (
	id INT NOT NULL,
	nome VARCHAR (100),
	cpf VARCHAR (50),
	senha VARCHAR(255),
	idade int,
	sexo VARCHAR (50),
	PRIMARY KEY (id, cpf)
);

CREATE TABLE endereco (
	id INT NOT NULL,
	numero int,
	rua VARCHAR (150),
	complemento VARCHAR (150),
	pessoa_id INT NOT NULL,
	PRIMARY KEY (id)
);

ALTER TABLE ENDERECO
ADD FOREIGN KEY (PESSOA_ID) 
REFERENCES PESSOA(ID);

CREATE SEQUENCE S_PESSOA 
	MINVALUE 1 MAXVALUE 999999 INCREMENT BY 1 START WITH 1 ;
	
CREATE SEQUENCE S_ENDERECO 
	MINVALUE 1 MAXVALUE 999999 INCREMENT BY 1 START WITH 1 ;