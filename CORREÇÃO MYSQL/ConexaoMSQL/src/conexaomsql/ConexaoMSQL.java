package conexaomsql;

import java.sql.*;

public class ConexaoMSQL extends Conexao{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Usuarios usa = new Usuarios();
        usa.setUser("adm");
        usa.setPassword("1234ab");
        
        if (usa.verificarUsuarios() == true) {
            System.out.println("Usuário encontrado");
        }
        else {
            System.out.println("Uauário não encontrado");
        }
                
        
    }    
}
