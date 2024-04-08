package org.senai.market.marketsenai.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalvarObjeto {
    public static void main(String[] args) {
        try (Connection connection = CriaConexao.getConexao()) {
            Statement stm = connection.createStatement();

            stm.execute("INSERT INTO Produto (nome, descricao, preco)" +
                            "VALUES ('Curso de Angular', 'Curso introdutório de Angular', 500)",
                    Statement.RETURN_GENERATED_KEYS);

            ResultSet result = stm.getGeneratedKeys();

            while (result.next()) {
                System.out.println("ID inserido: " + result.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}