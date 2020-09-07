package conexaomsql;

import java.sql.*;

public abstract class Conexao {
     
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3308/estacio";
    final private String user = "root";
    final private String password = "Estudante@1";
     
    public Connection getConnection() throws ClassNotFoundException, SQLException {
         
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
     
}

   
    

