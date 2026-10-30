package br.com.sistema.model;

import  java.sql.Connection;
import java.sql.DriverAction;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/db_sistema?useSSL=false&serverTime zone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection getConexao() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
