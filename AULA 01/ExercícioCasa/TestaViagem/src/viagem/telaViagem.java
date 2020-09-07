package viagem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class telaViagem extends JFrame implements ActionListener{
    Viagem vg = new Viagem();
    
    JTextField txtDistancia, txtCombustivel, txtCusto, txtDespesa, txtCustoKM, txtConsumo, txtCustoTotal;
    JButton bEnviar,bLimpar;
    
    public telaViagem(){
        //distancia combustivel custo despesa
        //resultado CustoKM Custo Consumo
        super("Viagem");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        setLayout(new GridLayout(8,2));
        
        JLabel lblDistancia = new JLabel("Distância: ");
        JLabel lblCombustivel = new JLabel("Combustível: ");
        JLabel lblCusto = new JLabel("Custo: ");
        JLabel lblDespesa = new JLabel("Despesa: ");
        JLabel lblCustoKM = new JLabel("Custo por KM: ");
        JLabel lblConsumo = new JLabel("Consumo: ");
        JLabel lblCustoTotal = new JLabel("Custo Total: ");
        
        txtDistancia = new JTextField("");
        txtCombustivel = new JTextField("");
        txtCusto = new JTextField("");
        txtDespesa = new JTextField("");
        txtCustoKM = new JTextField("");
        txtCustoKM.setEnabled(false);
        txtCustoKM.setBackground(Color.black);
        txtConsumo = new JTextField("");
        txtConsumo.setEnabled(false);
        txtConsumo.setBackground(Color.black);
        txtCustoTotal = new JTextField("");
        txtCustoTotal.setEnabled(false);
        txtCustoTotal.setBackground(Color.black);
        bEnviar = new JButton("Enviar");
        bLimpar = new JButton("Limpar");
        
        c.add(lblDistancia);
        c.add(txtDistancia);
        c.add(lblCombustivel);
        c.add(txtCombustivel);
        c.add(lblCusto);
        c.add(txtCusto);
        c.add(lblDespesa);
        c.add(txtDespesa);
        c.add(lblCustoKM);
        c.add(txtCustoKM);
        c.add(lblConsumo);
        c.add(txtConsumo);
        c.add(lblCustoTotal);
        c.add(txtCustoTotal);
        c.add(bEnviar);
        c.add(bLimpar);
        
        setVisible(true);
        
        txtDistancia.addActionListener(this);
        txtCombustivel.addActionListener(this);
        txtCusto.addActionListener(this);
        txtDespesa.addActionListener(this);
        txtCustoKM.addActionListener(this);
        txtConsumo.addActionListener(this);
        txtCustoTotal.addActionListener(this);
        
        bEnviar.addActionListener(this);
        bLimpar.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent acB){
        if(bEnviar == acB.getSource()){
            vg.setDistancia(Float.parseFloat(txtDistancia.getText()));
            vg.setCombustivel(Float.parseFloat(txtCombustivel.getText()));
            vg.setCusto(Float.parseFloat(txtCusto.getText()));
            vg.setDespesa(Float.parseFloat(txtDespesa.getText()));
            txtCustoKM.setText(vg.calcularCustoKm()+"");
            txtConsumo.setText(vg.calcularConsumo()+"");
            txtCustoTotal.setText(vg.calcularCusto()+"");
        }
        if(bLimpar == acB.getSource()){
            txtDistancia.setText("");
            txtCombustivel.setText("");
            txtCusto.setText("");
            txtDespesa.setText("");
            txtCustoKM.setText("");
            txtConsumo.setText("");
            txtCustoTotal.setText("");
        }
    }
}
