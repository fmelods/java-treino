package br.com.fiap.mensagem.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    public Connection getConexao() throws Exception {
        String us = "rm556099";
        String pw = "311004";
        String uri = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
        return DriverManager.getConnection(uri, us, pw);
    }

}
