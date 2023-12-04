Nome banco de dados: CRUD

CREATE TABLE usuario (
	id SERIAL PRIMARY KEY,
	usuario VARCHAR(255) not null UNIQUE,
	email VARCHAR(255) not null UNIQUE,
	senha VARCHAR(255) not null);

INSERT INTO usuario (usuario, email, senha)
	VALUES ('marcio', '123', '123');

CREATE TABLE produto (
	id SERIAL primary KEY,
	nome VARCHAR(255) UNIQUE,
	quantidade BIGINT,
	valor FLOAT);

INSERT INTO produto (nome, quantidade, valor)
	VALUES ('agua', 10, 1.10),
	('salgado', 2, 2.50),
	('fruta', 1, 5),
	('refrigerante', 3, 4),
	('arroz', 3, 10);