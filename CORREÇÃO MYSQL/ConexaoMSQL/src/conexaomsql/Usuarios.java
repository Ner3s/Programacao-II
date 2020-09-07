package conexaomsql;

import java.sql.*;

public class Usuarios extends Conexao{
    private String user;
    private String password;

    Connection cx;
     
    public Usuarios() throws ClassNotFoundException, SQLException {
        this.cx = getConnection();
    }
     
    public Usuarios(Connection cx) {
                this.cx = cx;
    }
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean verificarUsuarios() throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
       
            pst = cx.prepareStatement("select * from usuarios where user = ? and password = ?");
            pst.setString(1, this.user);
            pst.setString(2, this.password);
            rs = pst.executeQuery();
            if(rs.next()){
                return true;
            }
        
        return false;
    }
    
    
}
