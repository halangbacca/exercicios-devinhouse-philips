-- Inserir dados

-- PROFESSORES
INSERT INTO PROFESSORES (nome, sobrenome, endereco, telefone, email, data_nascimento, genero, cidade, estado, nacionalidade)
VALUES ('Alan', 'Scott', 'Av. Conselheiro Nébias', '99887-7665', 'alanscott@gmail.com', '28/04/1994', 'Masculino', 'Santos', 'SP', 'Brasileiro');

INSERT INTO PROFESSORES (nome, sobrenome, endereco, telefone, email, data_nascimento, genero, cidade, estado, nacionalidade)
VALUES ('Júlio', 'Horto', 'Rua Bauruense', '99887-7665', 'juliohorto@gmail.com', '15/09/1982', 'Masculino', 'Bauru', 'SP', 'Brasileiro');

INSERT INTO PROFESSORES (nome, sobrenome, endereco, telefone, email, data_nascimento, genero, cidade, estado, nacionalidade)
VALUES ('Astrid', 'Hannah', 'Av. Nações Unidas', '91122-3344', 'analyvia@gmail.com', '12/06/1996', 'Feminino', 'Buenos Aires', 'Buenos Aires', 'Argentina');

INSERT INTO PROFESSORES (nome, sobrenome, endereco, telefone, email, data_nascimento, genero, cidade, estado, nacionalidade)
VALUES ('William', 'Gomes', 'Rua Cipó', '98765-1223', 'williamgomes@gmail.com', '01/03/1993', 'Masculino', 'Porto Alegre', 'RS', 'Brasileiro');

INSERT INTO PROFESSORES (nome, sobrenome, endereco, telefone, email, data_nascimento, genero, cidade, estado, nacionalidade)
VALUES ('Lionel', 'West', 'Rua Americana', '99009-0990', 'lionelwest@gmail.com', '22/10/1945', 'Masculino', 'Smallville', 'Kansas', 'Americano');


-- ESTUDANTES
INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Tiago', 'Rezende', '195', 'tiagoviniciusrezende@simsvale.com.br', '18/02/2004', 'Masculino', 'Tubarão', 'SC', 'Brasileiro', 10.0);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Enrico', 'Santos', '123', 'enrico_dossantos@edpbr.com.br', '16/03/1999', 'Masculino', 'Belo Jardim', 'PE', 'Brasileiro', 3.5);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Rebeca', 'Lavínia', '162', 'rebeca_lavinia_jesus@i9pneus.com.br', '06/03/1971', 'Feminino', 'Araras', 'SP', 'Brasileiro', 7.5);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Otávio', 'Luz', '238', 'otavio.marcio.daluz@yahoo.se', '23/02/1986', 'Masculino', 'Picos', 'PI', 'Brasileiro', 4.5);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Joana', 'Moraes', '225', 'joana.moraes@argo.com.br', '15/02/1993', 'Feminino', 'Macapá', 'AP', 'Brasileiro', 8.5);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Isabelly', 'Cavalcanti', '293', 'isabelly_cavalcanti@tanby.com.br', '09/01/1984', 'Feminino', 'Macapá', 'AP', 'Brasileiro', 6.0);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Lorenzo', 'Jesus', '345', 'lorenzo_jesus@mpv.org.br', '06/03/1977', 'Masculino', 'Rio Branco', 'AC', 'Brasileiro', 1.0);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Eduarda', 'Galvão', '321', 'eduarda-galvao80@gimail.com', '02/01/1956', 'Feminino', 'Várzea Grande', 'MT', 'Brasileiro', 9.5);

INSERT INTO ESTUDANTES (nome, sobrenome, matricula, email, data_nascimento, genero, cidade, estado, nacionalidade, media_geral)
VALUES ('Samuel', 'Fernandes', '309', 'samuel-fernandes78@arablock.com.br', '22/02/2004', 'Masculino', 'Araguaína', 'TO', 'Brasileiro', 5.5);


-- CURSOS
INSERT INTO CURSOS (codigo, nome, ead, id_professor, numero_maximo_alunos)
VALUES ('C1', 'ALGORITMOS', 0, 1, 15);

INSERT INTO CURSOS (codigo, nome, ead, id_professor, numero_maximo_alunos)
VALUES ('C2', 'BANCO DE DADOS', 1, 2, 30);

INSERT INTO CURSOS (codigo, nome, ead, id_professor, numero_maximo_alunos)
VALUES ('C3', 'JAVA', 0, 3, 45);

INSERT INTO CURSOS (codigo, nome, ead, id_professor, numero_maximo_alunos)
VALUES ('C4', 'SISTEMAS', 1, 3, 45);

INSERT INTO CURSOS (codigo, nome, ead, id_professor, numero_maximo_alunos)
VALUES ('C5', 'ANGULAR', 0, 5, 20);


-- MATRICULAS
INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (1, 1, 10.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (2, 1, 3.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (3, 1, 8.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (4, 2, 5.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (5, 2, 8.5);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (6, 2, 7.5);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (7, 3, 2.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (8, 3, 9.0);

INSERT INTO MATRICULAS (id_estudante, id_curso, media_aluno)
VALUES (9, 3, 6.0);

COMMIT;

-- UPDATE

-- Atualizar a média geral de um aluno
UPDATE ESTUDANTES SET MEDIA_GERAL = 4.0 WHERE ID = 2;
COMMIT;

-- Atualizar os cursos cujos professores não moram em Santa Catarina para o modelo EAD
UPDATE CURSOS SET EAD = '1' 
WHERE ID_PROFESSOR IN (SELECT ID FROM PROFESSORES WHERE ESTADO <> 'SC');

COMMIT;

-- Deletar um curso
DELETE FROM CURSOS WHERE CODIGO = 'C5';

COMMIT;
