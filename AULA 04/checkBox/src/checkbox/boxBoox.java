package checkbox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class boxBoox extends JFrame implements ActionListener,ItemListener {
    JCheckBox jcbItalico, jcbNegrito;
    JLabel txtEspecial;
    public boxBoox(){
        super("Olá, Tudo bem");
        setSize(300,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(new FlowLayout());
        
        JLabel txtNormal = new JLabel("TEXTO: ");
        txtEspecial = new JLabel(" **ESPECIAL** ");
        jcbItalico = new JCheckBox("Itálico");
        jcbNegrito = new JCheckBox("Negrito");
        
        c.add(txtNormal);
        c.add(txtEspecial);
        c.add(jcbItalico);
        c.add(jcbNegrito);
       
        jcbItalico.addItemListener(this);
        jcbNegrito.addItemListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        
        if(jcbItalico.isSelected()){
            txtEspecial.setFont(new Font("Arial",Font.ITALIC,15));
        }
        if(jcbNegrito.isSelected()){
            txtEspecial.setFont(new Font("Arial",Font.BOLD,15));
        }
        
        if(jcbItalico.isSelected() && jcbNegrito.isSelected()){
           // txtEspecial.setFont(new Font("Arial",));
        }
    }
}
