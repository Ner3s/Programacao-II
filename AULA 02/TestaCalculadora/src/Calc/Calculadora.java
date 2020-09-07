package Calc;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JFrame implements ActionListener { //implements para interfaces pode ter "Herança multiplas por interfaçes"

    JTextField txtNum1, txtNum2, txtResultado;
    JButton bMais, bMenos, bDivi, bMulti, bLimpar;

    public Calculadora() {
        super("Calculadora");
        setSize(350, 110);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 4));

        JLabel lbNum1 = new JLabel("Num.1 ");
        JLabel lbTotal = new JLabel("Total");
        JLabel lbNum2 = new JLabel("Num.2 ");
        
        txtNum1 = new JTextField("");
        txtNum2 = new JTextField("");
        txtResultado = new JTextField("");
        txtResultado.setEnabled(false); // deixa o campo sem qualquer tipo de edição.
        
        bMais = new JButton("+");
        bMenos = new JButton("-");
        bMulti = new JButton("X");
        bDivi = new JButton("/");
        bLimpar = new JButton("Limpar");
        bLimpar.setBackground(Color.black);// cor do fundo
        bLimpar.setForeground(Color.white);// cor da fonte

        c.add(lbNum1);
        c.add(txtNum1);
        c.add(bMais);
        c.add(bMenos);

        c.add(lbNum2);
        c.add(txtNum2);
        c.add(bMulti);
        c.add(bDivi);

        c.add(lbTotal);
        c.add(txtResultado);
        c.add(bLimpar);
        setVisible(true);
        
        txtNum1.addActionListener(this);
        txtNum2.addActionListener(this);
        txtResultado.addActionListener(this);
        bMais.addActionListener(this);
        bMenos.addActionListener(this);
        bDivi.addActionListener(this);
        bMulti.addActionListener(this);
        bLimpar.addActionListener(this);
        
    }
    

    @Override//reescrevendo, existe um metodo abstrato em algum lugar e está sobreescrevendo.
    public void actionPerformed(ActionEvent ae){
        
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        
        if(bMais == ae.getSource()){
            float r = num1+num2;
            txtResultado.setText(""+r);
        }
        
        if(bMenos == ae.getSource()){
            float r = num1-num2;
            txtResultado.setText(""+r);
        }
        
        if(bDivi == ae.getSource()){
            float r = num1/num2;
            txtResultado.setText(""+r);
        }
        
        if(bMulti == ae.getSource()){
            float r = num1*num2;
            txtResultado.setText(""+r);
        }
        
        if(bLimpar == ae.getSource()){
            txtNum1.setText("");
            txtNum2.setText("");
            txtResultado.setText("");
        }
    }
}