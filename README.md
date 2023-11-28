Nome do banco de dados: CRUD

CREATE TABLE usuario ( id SERIAL PRIMARY KEY, usuario VARCHAR(255) not null UNIQUE, email VARCHAR(255) not null UNIQUE, senha VARCHAR(255) not null);

INSERT INTO usuario (usuario, email, senha) VALUES ('marcio', '123', '123');

CREATE TABLE produto (
	id SERIAL primary KEY, 
	nome VARCHAR(255) UNIQUE, 
	quantidade BIGINT,
	valor FLOAT);