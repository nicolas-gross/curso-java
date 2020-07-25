#CRIAR BASE DE DADOS
CREATE DATABASE aula04;

#SELECIONAR BASE
USE aula04;

#TABELA
CREATE TABLE cursos(
	idCurso INT AUTO_INCREMENT PRIMARY KEY,
    nomeCurso VARCHAR(40),
    valorCurso DOUBLE
);

#PROCEDIMENTO PARA CADASTRAR CURSOS
DELIMITER $
	CREATE PROCEDURE cadastrar(in nome VARCHAR(30), in valor DOUBLE)
    
    BEGIN
		
        DECLARE quantidade INT;
        DECLARE mensagem VARCHAR(40);
        
        SET quantidade = (SELECT COUNT(*) FROM cursos WHERE nomeCurso = nome);
        
        IF quantidade = 0 THEN
		INSERT INTO cursos (nomeCurso, valorCurso) VALUES (nome, valor);
        SET mensagem = "Curso cadastrado com sucesso!";
			ELSE
            SET mensagem = "Cadastre um outro curso!";
		END IF;
        
        SELECT mensagem;
    END $
DELIMITER ;

#APAGAR PROCEDIMENTO
DROP PROCEDURE cadastrar;

#TESTAR PROCEDIMENTO
CALL cadastrar("Angular", 1500);

#SELECIONAR DADOS
SELECT * FROM cursos;

#CRIAR TRIGGER
ALTER TABLE cursos ADD valorDesconto DOUBLE;


CREATE TRIGGER desconto BEFORE INSERT
ON cursos
FOR EACH ROW
SET new.valorDesconto = new.valorCurso * 0.9;                              


/*
	BEFORE: Executa a trigger antes dos comandos INSERT, UPDATE ou DELETE
    AFTER: Executa a trigger depois dos comandos INSERT, UPDATE ou DELETE
    
    NEW: Obtêm um dado que não está na tabela ou altera o valor de uma coluna
    OLD: Obtêm um dado que já se encontra na tabela
*/


