package conexaomysql;

import java.sql.*;

public class Conexao {
    public Connection getConnection() throws ClassNotFoundException{
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3308/estacio","root","root");
        }catch(SQLException erroSQL){ }
        
        return null;
    }

}
