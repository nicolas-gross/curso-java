#Criar base de dados
CREATE DATABASE exercicio01;

#Selecionar base de dados
USE exercicio01;

#Criar tabela uzuarios
CREATE TABLE uzuarios(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20),
    sobrenome VARCHAR(50),
    idade INT
);

#Alterar o nome da tabela uzuarios para usuarios
ALTER TABLE uzuarios RENAME TO usuarios;

#Adicionar uma coluna chamada email do tipo varchar com tamanho de 40 caracteres
ALTER TABLE usuarios ADD COLUMN email VARCHAR(40);

#Remover a coluna sobrenome
ALTER TABLE usuarios DROP COLUMN sobrenome;

#Cadastrar os seguintes dados:
INSERT INTO usuarios VALUES
(null, "Vanessa", 16, "vanessa.rosa@gmail.com"),
(null, "Adailton",22,"adailton.maas@yahoo.com.br"),
(null,"Andressa",36,"dessa.simas@uol.com.br"),
(null,"Mayra",24,"mayra.antunes@gmail.com"),
(null,"Cristiane",14,"criss.maya@gmail.com"),
(null,"Leonardo",15,"leo.kopff@terra.com.br"),
(null,"Carina",27,"carina.almeida@gmail.com"),
(null,"Clóvis",29,"clovis.simao@hotmail.com"),
(null,"Gabriela",23,"gabriela.braga@live.com"),
(null,"Cibele",null,"cibele.lins@uol.com.br");

#Exibir o número de usuários (deverá retornar 10)
SELECT * FROM usuarios;

#Exibir a quantidade de usuários menores de 18 anos
SELECT * FROM usuarios WHERE idade < 18;

#Quantos usuários possuem o e-mail do gmail
SELECT * FROM usuarios WHERE email LIKE "%gmail%";

#Retornar o nome da pessoa com a maior idade
SELECT * FROM usuarios WHERE idade = (SELECT MAX(idade) FROM usuarios);

#Retornar o nome do do usuário, onde a idade seja null
SELECT * FROM usuarios WHERE idade IS NULL;

###Código para poder realizar alterações de dados nas tabelas###
SET sql_safe_updates=0; 

#Alterar todas as idades que estejam null para 27
UPDATE usuarios SET idade = 27 WHERE idade IS NULL;

#Deletar todos os usuários onde a idade seja inferior a 18 anos 
DELETE FROM usuarios WHERE idade < 18;

#Excluir os dados da tabela usuarios e reiniciar a contagem da coluna código.
TRUNCATE TABLE usuarios;

#Excluir a tabela usuarios
DROP DATABASE exercicio01;