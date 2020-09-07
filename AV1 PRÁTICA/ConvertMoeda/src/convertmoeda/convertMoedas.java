package convertmoeda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class convertMoedas extends JFrame implements ItemListener{
    
    JLabel lblMoeda,lblResultado;
    JTextField txtMoeda;
    JComboBox cbTipo;
    
    public convertMoedas(){
        super("Conversor");
        setSize(200,180);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        lblMoeda = new JLabel("Digite Valor: ");
        txtMoeda = new JTextField(13);
        
        String[] tMoedas = {"Euro","Dollar","Pesos"};
        cbTipo = new JComboBox(tMoedas);
        cbTipo.addItemListener(this);
        
        lblResultado = new JLabel("");
        
        c.add(lblMoeda);
        c.add(txtMoeda);
        c.add(cbTipo);
        c.add(lblResultado);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent ie){
        double convert;
        if(cbTipo.getSelectedItem() == "Euro"){
            convert = Double.parseDouble(txtMoeda.getText()) * 3.10;
        }
    }
}
