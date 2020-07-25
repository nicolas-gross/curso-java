#Criar base de dados
CREATE DATABASE exercicio02;

#Selecionar base de dados
USE exercicio02;

#Criar uma tabela chamada produtos
CREATE TABLE produtos(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	produto VARCHAR(40),
	categoria VARCHAR(20),
	valor DOUBLE,
	cadastro DATE
);

#Cadastrar os seguintes produtos:
INSERT INTO produtos VALUES
(null,"Smartphone Samsung A8","telefonia", 1400.00 , '2019-07-22'),
(null, "Notebook Acer A650","informática",'3800.00' ,  '2019-03-19'),
(null, "Telefone sem fio Intelbras","telefonia",'129.90', '2018-12-20'),
(null, "iPhone XR","telefonia", '5499.00', '2019-07-08'),
(null, "Notebook Dell Espiron 500","informática",'3975.80', '2019-01-29'),
(null, "All in one LG A8574","informática",'2547.12', '2019-02-13'),
(null, "Smartphone Motorola G7","telefonia",'799.00', '2019-04-03'),
(null, "Smartphone Galaxy S10","telefonia",'4600.00', '2019-05-03'),
(null, "Notebook Acer Axpros 47","informática",'2857.00', '2019-08-16'),
(null, "Smartphone Asus Zenfone 6","telefonia",'2356.00', '2018-07-29'),
(null, "Smartphone Samsung J4", null, '1700.00', '2018-06-16');

#Exibir a quantidade de produtos cadastrados
SELECT COUNT(*) FROM produtos;
 
#Exibir o nome dos produtos e valor, onde o cadastro esteja entre 01/04/2019 a 31/07/2019
SELECT * FROM produtos WHERE cadastro BETWEEN "2019-04-01" AND "2019-07-31";

#Alterar a categoria para telefonia o produto que seja da categoria null
UPDATE produtos SET categoria = "telefonia" WHERE categoria IS NULL;

#Exibir o nome das categorias cadastradas na tabela e a quantidade de produtos 
SELECT categoria, count(categoria) FROM produtos GROUP BY categoria;

#Exibir a média dos valores por categorias
SELECT ROUND(avg (valor),2) from produtos; 

#Nome e valor do produto mais barato
SELECT * FROM produtos WHERE valor = (SELECT min(valor) FROM produtos);

#Exibir todos os produtos da categoria telefonia com valor igual ou superior a 4.000,00     
SELECT * FROM produtos WHERE categoria = "Telefonia" and valor >= 4000;

#Listar todos os produtos cadastrados em 2018
SELECT * FROM produtos WHERE DATE_FORMAT(cadastro, "%Y") = 2018;

#Deletar todos os produtos que possuam o nome Samsung ou LG
DELETE FROM produtos WHERE produto LIKE '%Samsung%' OR produto LIKE '%LG%';

#Exibir o código do produto, onde o nome contenha o termo Intelbras 
SELECT codigo FROM produtos WHERE produto LIKE '%Intelbras%';

#Excluir a tabela produtos
DROP TABLE produtos;

#Excluir a base de dados
DROP DATABASE exercicio02;