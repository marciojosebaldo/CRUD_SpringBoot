Nome do banco de dados: CRUD

CREATE TABLE usuario ( id SERIAL PRIMARY KEY, usuario VARCHAR(255) not null, email VARCHAR(255) not null, senha VARCHAR(255) not null);

INSERT INTO usuario (usuario, email, senha) VALUES ('marcio', '123', '123');