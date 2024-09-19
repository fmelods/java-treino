package br.com.fiap.enquete.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public Connection getConexao() throws Exception {
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		return DriverManager.getConnection(url, "rm556099", "311004");
	}
	
}
