#Criar base de dados
CREATE DATABASE exercicio04;

#Selecionar base de dados
USE exercicio04;

#Criar uma tabela chamada cursos
CREATE TABLE cursos(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	curso VARCHAR(40),
	valor DOUBLE,
	area VARCHAR(30),
	dificuldade INT
);

#Inserir os seguintes cursos
INSERT INTO cursos (curso, valor, area, dificuldade) VALUES
("PHP", 700, "Desenvolvimento Back-End", 2),
("Oracle", 2500, "Banco de Dados", 3),
("Java", 1700, "Desenvolvimento Back-End", 3), 
("Spring MVC", 2500, "Desenvolvimento Back-End", 3),
("MySQL", 400, "Banco de Dados", 1),
("HTML e CSS", 500, "Desenvolvimento Front-End", 1),
("Excel Básico", 400, "Utilidades", 1),
("Excel Dashboard", 600, "Utilidades", 2),
("C#", 1600, "Desenvolvimento Back-End", 3),
("Python", 780, "Desenvolvimento Back-End", 2),
("JavaScript", 500, "Desenvolvimento Back-End", 2),
("NodeJS", 900, "Desenvolvimento Back-End", 2);

#Exibir o nome dos cursos, valor e o nível de dificuldade.
SELECT curso, valor,
CASE 
    WHEN dificuldade = 1 THEN "Iniciante"
    WHEN dificuldade = 2 THEN "Intermediário"
    WHEN dificuldade = 3 THEN "Avançado"
END AS dificuldade
FROM cursos;

#Exibir a quantidade de cursos através da área
SELECT area, COUNT(*) FROM cursos GROUP BY area;

#Listar nome e valor dos cursos, ordene do maior valor para o menor
SELECT curso, valor FROM cursos ORDER BY valor;

#Exibir o nome dos cursos de maior valor
SELECT curso, valor FROM cursos WHERE valor = (SELECT MAX(valor) FROM cursos);

#Quantidade de cursos cadastrados por dificuldade
SELECT dificuldade, COUNT(*) FROM cursos GROUP BY dificuldade;

#Exibir todos os cursos de nível 2 ou 3 e que sejam da área de back-end e com valor mínimo de R$1.000,00      
SELECT * FROM cursos WHERE (dificuldade = 2 OR dificuldade = 3) AND (area = "Desenvolvimento Back-End") AND (valor >= 1000);

#Remover todos os cursos onde a área seja utilidades
DELETE FROM cursos WHERE area = "utilidades";

#Exibir os cinco cursos mais baratos.
SELECT * FROM cursos ORDER BY valor ASC LIMIT 5;

#Exibir o nome e o valor de todos os cursos que não sejam da área de back-end
SELECT curso, valor FROM cursos WHERE area <> "Desenvolvimento Back-End";

#Exibir a quantidade de cursos registrados, exiba a data e a hora da pesquisa realizada
SELECT COUNT(*), DATE_FORMAT(NOW(),"%d/%m/%Y") AS "Data", DATE_FORMAT(NOW(),"%H:%i") AS "Hora" FROM cursos;

#Exibir todos os dados do curso, onde o nome dele contenha a letra y
SELECT * FROM cursos WHERE curso LIKE "%y%";

#Excluir a tabela cursos
DROP TABLE cursos;

#Excluir a base de dados
DROP DATABASE exercicio04;