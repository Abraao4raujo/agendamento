package com.example.agendamento.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {

    private static final String URL = "jdbc:sqlite:c:/sqlite/db/agendamento.db";

    public static Connection connect() {
        try {
            var conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Não conectou! " + e.getMessage());
        }
        return null;
    }
}
