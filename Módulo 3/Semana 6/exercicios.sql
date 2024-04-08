DROP TABLE Produto CASCADE CONSTRAINTS;
DROP TABLE ProdutoPreco CASCADE CONSTRAINTS;

-- Exercício 1
CREATE TABLE Produto(
    Id NUMBER PRIMARY KEY, 
    Descricao VARCHAR2(50) NOT NULL,
    Status NUMBER(1) NOT NULL,
    Cadastro DATE NOT NULL,
    QuantidadeEmEstoque NUMBER NOT NULL
);

INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(1, 'PRODUTO A', 1, TO_DATE('2023-01-01', 'YYYY-MM-DD'), 200);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(2, 'PRODUTO B', 1, TO_DATE('2023-02-01', 'YYYY-MM-DD'), 100);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(3, 'PRODUTO C', 1, TO_DATE('2023-03-01', 'YYYY-MM-DD'), 300);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(4, 'PRODUTO D', 1, TO_DATE('2023-04-01', 'YYYY-MM-DD'), 50);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(5, 'PRODUTO E', 1, TO_DATE('2023-05-01', 'YYYY-MM-DD'), 40);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(6, 'PRODUTO F', 1, TO_DATE('2023-06-01', 'YYYY-MM-DD'), 60);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(7, 'PRODUTO G', 1, TO_DATE('2023-06-01', 'YYYY-MM-DD'), 70);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(8, 'PRODUTO H', 1, TO_DATE('2023-06-01', 'YYYY-MM-DD'), 150);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(9, 'PRODUTO I', 1, TO_DATE('2023-06-01', 'YYYY-MM-DD'), 250);
INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES(10, 'PRODUTO J', 1, TO_DATE('2023-06-01', 'YYYY-MM-DD'), 350);

SELECT * FROM Produto;

-- Exercício 2
CREATE TABLE ProdutoPreco(
    Id NUMBER PRIMARY KEY,
    IdProduto NUMBER,
    Valor NUMBER(10, 2) NOT NULL,
    Status NUMBER(1) NOT NULL,
    Cadastro DATE NOT NULL,
    
    CONSTRAINT fk_produto_preco FOREIGN KEY(IdProduto) REFERENCES Produto(Id)
);

INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(1, 1, 100.00, 1, TO_DATE('2023-01-01', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(2, 2, 200.00, 1, TO_DATE('2023-01-02', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(3, 3, 300.00, 1, TO_DATE('2023-01-03', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(4, 4, 400.00, 1, TO_DATE('2023-01-04', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(5, 5, 500.00, 1, TO_DATE('2023-01-05', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(6, 6, 600.00, 1, TO_DATE('2023-01-06', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(7, 7, 700.00, 1, TO_DATE('2023-01-07', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(8, 8, 800.00, 1, TO_DATE('2023-01-08', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(9, 9, 900.00, 1, TO_DATE('2023-01-09', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(10, 10, 1000.00, 1, TO_DATE('2023-01-10', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(11, 1, 1100.00, 1, TO_DATE('2023-01-11', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(12, 2, 1200.00, 1, TO_DATE('2023-01-12', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(13, 3, 1300.00, 1, TO_DATE('2023-01-13', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(14, 4, 1400.00, 1, TO_DATE('2023-01-14', 'YYYY-MM-DD'));
INSERT INTO ProdutoPreco(Id, IdProduto, Valor, Status, Cadastro) VALUES(15, 5, 1500.00, 1, TO_DATE('2023-01-15', 'YYYY-MM-DD'));

SELECT * FROM ProdutoPreco;

-- Exercício 3
SELECT Produto.id AS id_produto, ProdutoPreco.id AS id_produto_preco, Produto.descricao, ProdutoPreco.valor, TO_CHAR(ProdutoPreco.cadastro, 'MM-YYYY') AS data
	FROM Produto INNER JOIN ProdutoPreco ON Produto.Id = ProdutoPreco.IdProduto;

-- Exercício 4
DECLARE 
    soma NUMBER;

BEGIN
	SELECT SUM(valor) INTO soma FROM ProdutoPreco;
	DBMS_OUTPUT.PUT_LINE('O valor da soma é de ' || soma);
    CASE
	    WHEN soma < 150.00 THEN
        	DBMS_OUTPUT.PUT_LINE('Soma dos produtos menor que 150.00');
    	WHEN soma < 500.00 THEN
        	DBMS_OUTPUT.PUT_LINE('Soma dos produtos está entre 150.00 e 500.00');
        ELSE
        	DBMS_OUTPUT.PUT_LINE('Soma dos produtos está acima de 500.00');
	END CASE;
END;

-- Exercício 5
SELECT * FROM Produto LEFT JOIN ProdutoPreco ON Produto.Id = ProdutoPreco.IdProduto;

-- Exercício 6
BEGIN
	FOR i IN 1..3 LOOP
		FOR produto IN (SELECT id, valor FROM ProdutoPreco WHERE valor > 100) LOOP
			UPDATE ProdutoPreco p SET p.valor = produto.valor + (produto.valor * 0.15) WHERE p.id = produto.id;
		END LOOP;
	END LOOP;
END;

SELECT valor FROM ProdutoPreco;

-- Exercício 7
BEGIN
	FOR produto IN (SELECT Status FROM Produto) LOOP
		IF(produto.STATUS = 1) THEN
			DBMS_OUTPUT.PUT_LINE('Status ativo');
		ELSE
			DBMS_OUTPUT.PUT_LINE('Status inativo');
		END IF;
	END LOOP;
END;