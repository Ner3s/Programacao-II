package aula;
import javax.swing.*;
public class Frm02 extends JFrame{
    
    public Frm02 (){
        //criando o Frame
       
        setSize(300,100);
        setTitle("Cadastro de Categorias");
        setLocation(150,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //criando o Painel
        JPanel p1 = new JPanel();
        p1.setLayout(null);// gerenciador de Layout
        
        //Criando os componentes:
        //Label
        JLabel meuLabel = new JLabel("Código");
        meuLabel.setBounds(10,10,60,20);
        
        //Campo de Texto
        JTextField meuCampoTexto = new JTextField("  ");
        meuCampoTexto.setBounds(80,10,60,20);
        //Botão
        JButton meuBotao = new JButton("NomeBotão");
        meuBotao.setBounds(150,10,100,20);
        //colando os componentes no painel
        p1.add(meuLabel);
        p1.add(meuCampoTexto);
        p1.add(meuBotao);
        //colando o painel no frame
        add(p1);
        setVisible(true);
    }
}
