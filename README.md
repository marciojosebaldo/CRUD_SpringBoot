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
VALUES
	('agua', 10, 1.10),
	('salgado', 2, 2.50),
	('fruta', 1, 5),
	('refrigerante', 3, 4),
	('arroz', 3, 10),
	('café', 5, 8),
   	('chocolate', 8, 3.50),
   	('leite', 6, 2.20),
   	('pão', 4, 2),
   	('queijo', 2, 6),
   	('macarrão', 3, 4.50),
   	('biscoito', 7, 1.80),
   	('iogurte', 4, 3.25),
   	('sabonete', 10, 1.50),
   	('shampoo', 3, 5.80),
   	('escova de dentes', 2, 2.75),
   	('detergente', 5, 1.90),
   	('vassoura', 1, 8.50),
   	('sabão em pó', 4, 6.75),
   	('papel higiênico', 6, 3.40);