package frm00;

import java.awt.*;
import javax.swing.*;

public class Frm02 extends JFrame{
   public Frm02(){
       super("Cadastro de categorias");
       setSize(300,100);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       Container c = getContentPane();
       c.setLayout(new GridLayout());
       
       JLabel meuLabel = new JLabel("Código: ");
       //setBounds(10,10,60,20);
       
       JTextField meuCampoTexto = new JTextField("");
       //meuCampoTexto.setBounds(80,10,60,20);
       
       JButton meuBotão = new JButton("NomeBotão");
       //meuBotão.setBounds(150,10,100,20);
       
       c.add(meuLabel);
       c.add(meuCampoTexto);
       c.add(meuBotão);
       
       setVisible(true);
       
     //Gerenciadores de layout  
            
    //Flow -> auto organiza os componentes que vai seguir por ordem a sequência de componentes na janela.
    //Grid -> transforma a sua janela em uma tabela exigindo informação de linha e coluna.
    //Border -> Transforma tela ou janela e organiza de acordo com o seu posicionamento definindo como Norte-Sul  Leste-Oeste.
   }
}
