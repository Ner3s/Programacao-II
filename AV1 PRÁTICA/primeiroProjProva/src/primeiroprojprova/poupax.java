package primeiroprojprova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class poupax extends JFrame implements ActionListener {
    JLabel lblJuros, lblNumAn, lblDeposito,lblPoupado, lblResultado;
    JTextField txtJuros, txtNumAn, txtDeposito;
    JButton btnOk;
    double Tot;
    public poupax(){
        super("Poupax");
        setSize(300,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(5,2));
        
        lblJuros = new JLabel("Juros ao Mês %:");
        txtJuros = new JTextField();
        c.add(lblJuros);
        c.add(txtJuros);
        
        lblNumAn = new JLabel("Num. de anos: ");
        txtNumAn = new JTextField();
        c.add(lblNumAn);
        c.add(txtNumAn);
        
        lblDeposito =  new JLabel("Depósito mensal R$: ");
        txtDeposito = new JTextField();
        c.add(lblDeposito);
        c.add(txtDeposito);
        
        lblPoupado = new JLabel("Total poupado R$:");
        lblResultado = new JLabel("");
        JLabel lblEspaco = new JLabel("");
        c.add(lblPoupado);
        c.add(lblResultado);
        c.add(lblEspaco);
        
        btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        c.add(btnOk);    
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(btnOk == ae.getSource()){
            calcula(Integer.parseInt(txtNumAn.getText()),Double.parseDouble(txtDeposito.getText()),Double.parseDouble(txtJuros.getText()));
            lblResultado.setText(this.Tot+"%");
        }
        
    }
    
    public double calcula(int anos, double depositoMen, double juros){
        int num_pagamentos = anos * 12;
        double total = 0;
        juros = (12*juros);
        for(int x=0; x < num_pagamentos; x++){
            total += depositoMen;
            total = total + total * juros;
        }
        return this.Tot = total;
    }
}
