package conexaomysql;

import java.sql.*;

public abstract class Conexao {
    
    final private String DRIVER = "com.mysql.jdbc.Driver";
    final private String URL = "jdbc:mysql://localhost:3306/estacio";
    final private String USER = "root";
    final private String PASSWORD = "Estudante@1";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
