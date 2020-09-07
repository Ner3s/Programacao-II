package conexaomysql;

import java.sql.*;

public class AppConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Usuarios usa = new Usuarios();
        usa.setUser("adm");
        usa.setPassword("1234ab");
        
        if(usa.verificarUsuarios() == true){
            System.out.println("Usuários encontrado");
        }
        else{
            System.out.println("Usuários não encontrado");
        }
        
    }
    
}
