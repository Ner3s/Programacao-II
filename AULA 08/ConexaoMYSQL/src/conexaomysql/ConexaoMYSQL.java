package conexaomysql;

import java.sql.*;

public class ConexaoMYSQL extends Conexao {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        PreparedStatement stmt;
        
        Usuarios usa = new Usuarios();
        
        usa.setUser("adm");
        usa.setPassword("1234ab");    
        
        Connection con = new Conexao().getConnection();
        String sql = "select * from usuarios where "+
                "user = ? and"+
                "password = ?";
        
        stmt = con.prepareStatement(sql);
        stmt.setString(1,usa.getUser());
        stmt.setString(2,usa.getPassword());
        stmt.execute();
        stmt.close();
        
    }
}
