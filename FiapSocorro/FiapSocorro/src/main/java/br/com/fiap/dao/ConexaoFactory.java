package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    public Connection getConexao() throws Exception{
        //Class.forName("");
        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
        return DriverManager.getConnection(url, "rm556099", "311004");



    }
}
