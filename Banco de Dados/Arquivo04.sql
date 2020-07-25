#Criar base
CREATE DATABASE pizzaria;

#Selecionar a base
USE pizzaria;

#Tabela de pizzas
CREATE TABLE pizzas(
	idPizza INT AUTO_INCREMENT PRIMARY KEY,
    saborPizza VARCHAR(40),
    ingredientesPizza VARCHAR(200)
);

#Inserir pizzas
INSERT INTO pizzas (saborPizza, ingredientesPizza) VALUES
("Calabresa" ,"Molho de tomate, calabresa e queijo"),
("Marguerita","Molho de tomate, manjericão e queijo"),
("Frango com Catupiry","Frango, queijo e catupiry"),
("Portuguesa","Ovos, azeitona, queijo, ervilha e presunto");

#Tabela de clientes
CREATE TABLE clientes(
	idCliente INT AUTO_INCREMENT PRIMARY KEY,
	nomeCliente VARCHAR(30)
);

#Inserir clientes
INSERT INTO clientes (nomeCliente) VALUES
("Letícia"),
("Cleber");

#Tabela de pedidos
CREATE TABLE pedidos(
	idCliente INT,
    idPizza INT,
    dataPedido DATETIME,
    FOREIGN KEY (idCliente) REFERENCES clientes(idCliente),
    FOREIGN KEY (idPizza) REFERENCES pizzas(idPizza)
);

#Inserir pedidos
INSERT INTO pedidos VALUES
(1, 4, now()),
(2, 1, now()),
(1, 2, now());

#Selecionar pedidos
SELECT * FROM pedidos;

#Inner Join
SELECT
	clientes.nomeCliente,
    pizzas.saborPizza,
    DATE_FORMAT(pedidos.dataPedido, "%d/%m/%Y") as "Data",
    DATE_FORMAT(pedidos.dataPedido, "%H:%i") as "Hora"
FROM pedidos
INNER JOIN clientes
ON pedidos.idCliente = clientes.idCliente
INNER JOIN pizzas
ON pedidos.idPizza = pizzas.idPizza
ORDER BY pizzas.saborPizza DESC;

#Criar uma view
CREATE VIEW selecionarPedidos AS
SELECT
	clientes.nomeCliente,
    pizzas.saborPizza,
    DATE_FORMAT(pedidos.dataPedido, "%d/%m/%Y") as "Data",
    DATE_FORMAT(pedidos.dataPedido, "%H:%i") as "Hora"
FROM pedidos
INNER JOIN clientes
ON pedidos.idCliente = clientes.idCliente
INNER JOIN pizzas
ON pedidos.idPizza = pizzas.idPizza
ORDER BY pizzas.saborPizza DESC;

#Executar a view
SELECT * FROM selecionarPedidos;
SELECT nomeCliente, saborPizza FROM selecionarPedidos;

#Remover a view
DROP VIEW selecionarPedidos;

#Acesso a alterar dados
SET sql_safe_updates = 0;

#Alterar data do pedido
UPDATE pedidos SET dataPedido = "2020-03-01 12:44" WHERE idCliente=1;
UPDATE pedidos SET dataPedido = "2020-02-02 17:34:20" WHERE idCliente=2;

#BETWEEN
select * from pedidos
WHERE dataPedido BETWEEN "2020-02-01" AND "2020-02-29";


#Formatar data e hora: https://www.w3schools.com/sql/func_mysql_date_format.asp