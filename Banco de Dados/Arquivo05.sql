#Base de dados
CREATE DATABASE biblioteca;

#Selecionar base
USE biblioteca;

#Tabela autores
CREATE TABLE autores(
	idAutor INT AUTO_INCREMENT PRIMARY KEY,
    nomeAutor VARCHAR(40)
);

#Tabela gêneros
CREATE TABLE generos(
	idGenero INT AUTO_INCREMENT PRIMARY KEY,
    nomeGenero VARCHAR(30)
);


#Tabela livros
CREATE TABLE livros(
	nomeLivro VARCHAR(40),
    idAutor INT,
    idGenero INT,
    FOREIGN KEY(idAutor) REFERENCES autores(idAutor),
    FOREIGN KEY(idGenero) REFERENCES generos(idGenero)
);


#Cadastrar Autores
INSERT INTO autores (nomeAutor) VALUES
("Ana"),
("Beatriz"),
("Caio"),
("Daniel");

#Cadastrar gêneros
INSERT INTO generos (nomeGenero) VALUES
("Ação"),
("Aventura"),
("Drama"),
("Romance"),
("Terror");

#Cadastrar livros
INSERT INTO livros VALUES
("Fúria de Titãs", 1, 1),
("Pensando na Vida", 2, 3),
("Destino Sombrio", 4, 5);

#Inner Join
SELECT
	livros.nomeLivro,
    autores.nomeAutor,
    generos.nomeGenero
FROM livros
INNER JOIN autores
ON livros.idAutor = autores.idAutor
INNER JOIN generos
ON livros.idGenero = generos.idGenero;

#Left Join
SELECT
	generos.nomeGenero,
    livros.nomeLivro
FROM generos
LEFT JOIN livros
ON livros.idGenero = generos.idGenero;    

#Right Join
SELECT
	livros.nomeLivro,
    autores.nomeAutor
FROM livros
RIGHT JOIN autores
ON livros.idAutor = autores.idAutor;

#Procedure para cadastrar autores
CREATE PROCEDURE cadastrarAutor(nome varchar(40))
INSERT INTO autores (nomeAutor) VALUES (nome);

#Chamar procedure
CALL cadastrarAutor("Elaine");
SELECT * FROM autores;

#Procedure para cadastrar gênero e listar todos os gêneros
DELIMITER $$
	CREATE PROCEDURE cadastrarGenero(genero VARCHAR(30))
    BEGIN
		INSERT INTO generos (nomeGenero) VALUES (genero);
        SELECT * FROM generos;
    END $$
DELIMITER ;
CALL cadastrarGenero("Mistério");

#Contar livros cadastrados
CREATE PROCEDURE contarLivros()
SELECT COUNT(*) AS "Quantidade de livros" FROM livros;

CALL contarLivros;