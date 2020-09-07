package criajradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio extends JFrame implements ItemListener {
    
    JLabel lbl1, lbl2;
    JTextField txt1, txt2;
    JRadioButton rb1, rb2, rb3;
    ButtonGroup bg;
    
    public Radio(){
        super ("Teste RadioButton");
        setLocationRelativeTo(null);
        setSize(200,150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        
        lbl1 = new JLabel("Valor: ");
        txt1 = new JTextField("");
        
        p1.add(lbl1);
        p1.add(txt1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3));
        
        rb1 = new JRadioButton("10%");
        rb2 = new JRadioButton("20%");
        rb3 = new JRadioButton("30%");
        
        p2.add(rb1);
        p2.add(rb2);
        p2.add(rb3);
        
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));
        
        lbl2 = new JLabel("Resultado: ");
        txt2 = new JTextField("");
        txt2.setEnabled(false);
        
        p3.add(lbl2);
        p3.add(txt2);
        
        c.add(p1);
        c.add(p2);
        c.add(p3);
        
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        
        
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie){
        double num = Double.parseDouble(txt1.getText());
        
        
        
        if(rb1 == ie.getSource()){
            num += num *0.1;
        }
        //usar o de cima ou de baixo 
        if(rb2.isSelected()){
            num += num *0.2;
        }
        
        if (rb3.isSelected()){
            num += num *0.3;
        }
        
        txt2.setText(""+num);
    }
}
