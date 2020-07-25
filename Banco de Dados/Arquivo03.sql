#Criar base de dados
CREATE DATABASE aula03;

#Selecionar a base de dados
USE aula03;

#Tabela de cargos
CREATE TABLE cargos(
	idCargo INT AUTO_INCREMENT PRIMARY KEY,
    nomeCargo VARCHAR(20)
);

#Cadastrar cargos
INSERT INTO cargos (nomeCargo) VALUES
("Desenvolvedor Java"),
("Analista"),
("Desenvolvedor C#");

#Tabela de colaboradores
CREATE TABLE colaboradores(
	idColaborador INT AUTO_INCREMENT PRIMARY KEY,
    nomeColaborador VARCHAR(30),
    idCargo INT,
    FOREIGN KEY(idCargo) REFERENCES cargos(idCargo)
);

#Cadastrar colaboradores
INSERT INTO colaboradores (nomeColaborador, idCargo) VALUES
("Anderson", 2),
("Raquel", 1);

#Inner Join
SELECT
	colaboradores.nomeColaborador,
    cargos.nomeCargo
FROM colaboradores
INNER JOIN cargos
ON colaboradores.idCargo = cargos.idCargo;

# Inserir colaborador extra
INSERT INTO colaboradores VALUES (null, "Amanda", 2);

#Left/Right Join
SELECT
	cargos.nomeCargo,
    colaboradores.nomeColaborador
FROM cargos
LEFT JOIN colaboradores
ON cargos.idCargo = colaboradores.idCargo;
