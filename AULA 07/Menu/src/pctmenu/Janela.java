package pctmenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
    JMenuBar M1;
    JTextField T1;
    JMenu menuCadastro, menuRelatorio;
    JMenuItem miCliente, miFornecedor, miSair, mirlCliente, mirlFornecedor;
    
    public Janela(){
        setTitle("Uso de Menus");
        setSize(270,130);
        setLocation(50,50);
        Container c = getContentPane();
        c.setBackground(new Color(0,128,128));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new FlowLayout());
        
        T1 = new JTextField(18);
        M1 = new JMenuBar();//Cria uma barra de menus
        menuCadastro = new JMenu("Cadastro");//cria um novo menu
        menuRelatorio = new JMenu("Relatorios");
        miCliente = new JMenuItem("Cliente");//cria um item
        miCliente.addActionListener(this);
        miFornecedor = new JMenuItem("Fornecedor");
        miFornecedor.addActionListener(this);
        miSair = new JMenuItem("Sair do Sistema");
        miSair.addActionListener(this);
        menuCadastro.add(miCliente);
        menuCadastro.add(miFornecedor);
        menuCadastro.add(miSair);
        mirlCliente = new JMenuItem("Relação de Clientes");
        mirlCliente.addActionListener(this);
        mirlFornecedor = new JMenuItem("Relação de Fornecedores");
        mirlFornecedor.addActionListener(this);
        menuRelatorio.add(mirlCliente);
        menuRelatorio.add(mirlFornecedor);
        M1.add(menuCadastro);
        M1.add(menuRelatorio);
        setJMenuBar(M1);
        c.add(T1);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== miCliente)
            T1.setText("Escolhido o item Cliente");
        if(ae.getSource()== miFornecedor)
            T1.setText("Escolhido o item Fornecedor");
        if(ae.getSource() == mirlCliente)
            T1.setText("Escolhido o item Relação de Cliente");
        if(ae.getSource() == mirlFornecedor)
            T1.setText("Escolhido o item Relação de Fornecedores");
        if(ae.getSource()==miSair)
            System.exit(0);
        
    }
}
