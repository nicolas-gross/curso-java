#Criar base de dados
CREATE DATABASE exercicio03;

#Selecionar base de dados
USE exercicio03;

#Criar uma tabela chamada alunos
CREATE TABLE alunos( 
	codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    genero VARCHAR(10),
    nota1 DOUBLE,
    nota2 DOUBLE,
    nota3 DOUBLE
);

#Cadastre os seguintes dados:
INSERT INTO alunos VALUES 
(null,"Alana","Feminino", 7, 8 , 9.5),
(null,"Brenda","Feminino", 8.5 , 7.3 ,7.7),
(null,"Gustavo","Masculino", 9, 9.1, 8.6),
(null,"Júlio","Masculino", 4.5 , 3.9 , 4),
(null,"Jéssica","Feminino", 7 , 6.8, 7),
(null,"Lúcia","Feminino", 10 , 9.8 , 10),
(null,"Rony","Masculino" , 5.6 , 6.3 , 5.9),
(null,"Tamara","Feminino",7  , 8 , 7.5 ),
(null,"Guilherme","Masculino", 7 , 7.1 , 7.7),
(null,"Lorena","Feminino", 4 , 4.5 , 4.4 );

#Exibir a quantidade de homens e mulheres
SELECT genero, COUNT(genero) FROM alunos GROUP BY genero;

#Exibir o nome e a média de cada aluno
SELECT nome, ROUND((nota1+nota2+nota3)/3,2) AS media FROM alunos;

#Contar quantos alunos obtiveram média 7 ou superior
SELECT count(*) FROM alunos WHERE ROUND((nota1+nota2+nota3)/3,2) >= 7;

#Nome, notas e média do aluno com a maior média
SELECT nome, nota1, nota2, nota3, ROUND((nota1+nota2+nota3)/3,2) AS media FROM alunos WHERE (nota1+nota2+nota3)/3 = (SELECT MAX((nota1+nota2+nota3)/3) FROM alunos);

#Nome, notas e média do aluno com a menor média
SELECT nome, nota1, nota2, nota3, round((nota1+nota2+nota3)/3,2) as media from alunos where round((nota1+nota2+nota3)/3,2) = (select min(round((nota1+nota2+nota3)/3,2)) from alunos);

#Exibir todos os nomes cadastrados e suas situações. Caso a média seja 7 ou mais exibir Aprovado, caso contrário Reprovado.
SELECT nome, IF((nota1+nota2+nota3)/3 > 7, "Aprovado" , "Reprovado") FROM alunos;

#Alterar a aluna Jéssica para Joice
UPDATE alunos SET nome = "Joice" WHERE codigo = 5;

#Exibir a quantidade de alunos que tenham média de 7 ou superior e do gênero masculino
SELECT count(*) FROM alunos WHERE round((nota1+nota2+nota3)/3,2) >= 7 AND genero = "Masculino";

#Exibir a quantidade de alunos que tenham a média entre 8 e 9 do gênero feminino
SELECT count(*) FROM alunos WHERE ((nota1+nota2+nota3)/3 BETWEEN 8 AND 9) AND (genero = "feminino");	

#Exibir a média da turma
SELECT AVG(round((nota1+nota2+nota3)/3)) AS media_da_turma FROM alunos;

#Exibir o nome dos alunos e suas médias, onde suas respectivas médias sejam maiores ou iguais a média da turma
SELECT nome, round((nota1+nota2+nota3)/3,2) AS medias FROM alunos WHERE (nota1+nota2+nota3)/3 >= 7;

#Listar o nome dos alunos, onde as três notas obtidos sejam 7 ou superior
select nome, nota1, nota2, nota3 from alunos  where nota1 >7 and nota2>7 and nota3>7;

#Excluir a tabela alunos
DROP TABLE alunos;

#Excluir a base de dados (EXTRA)
DROP DATABASE exercicio03;