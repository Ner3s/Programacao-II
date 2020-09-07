package conexaomysql;

import java.sql.*;

public class Usuarios extends Conexao {
    private String user;
    private String password;
    
    Connection con;
    
    public Usuarios() throws SQLException, ClassNotFoundException{
        this.con = getConnection();
    }
    
    public Usuarios(Connection con){
        this.con = con;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean verificarUsuarios() throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        pst = con.prepareStatement("select * from usuarios where user = ? and password = ?");
        pst.setString(1, this.user);
        pst.setString(2, this.password);
        rs = pst.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
}
