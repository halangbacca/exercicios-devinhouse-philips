-- Busque os cursos que possuem número máximo de alunos > 30 e que sejam presenciais
SELECT * FROM CURSOS WHERE NUMERO_MAXIMO_ALUNOS > 30 AND EAD = '0';

-- Busque os professores nascidos na América do Sul
SELECT * FROM PROFESSORES WHERE NACIONALIDADE IN ('Brasileiro', 'Argentino', 'Colombiano', 'Boliviano', 'Chileno', 'Equatoriano', 'Peruano', 'Venezuelano', 'Uruguaio' 'Surinamês', 'Paraguaio', 'Guianense');

-- Busque os alunos cujos nomes comecem com a letra J
SELECT * FROM ESTUDANTES WHERE NOME LIKE 'J%';

-- Busque os alunos com a média geral maior do que 7, ordenando do maior para o menor
SELECT * FROM ESTUDANTES WHERE MEDIA_GERAL > 7 ORDER BY MEDIA_GERAL DESC;

-- Busque por todos os cursos ministrados por professoras
SELECT * FROM CURSOS C
    JOIN PROFESSORES P 
    ON C.ID_PROFESSOR = P.ID
    WHERE P.GENERO = 'Feminino';

-- Busque por todos os alunos que estão matriculados em cursos EAD
SELECT * FROM ESTUDANTES E
    JOIN MATRICULAS M
    ON M.ID_ESTUDANTE = E.ID
    JOIN CURSOS C
    ON M.ID_CURSO = C.ID
    WHERE C.EAD = '1';