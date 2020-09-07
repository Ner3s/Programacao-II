package comboxx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Combo extends JFrame implements ItemListener {
    
    JComboBox cB;
    JTextField texto;
    
    public Combo(){
        setSize(250,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cont = getContentPane();
        setLayout(new GridLayout(1,3));
        
        JLabel jbl = new JLabel("Selecione um cor");
        texto = new JTextField();
        
        
        String[] cores = {"Vermelho","Preto"};
        cB = new JComboBox(cores);
        texto.setText(""+cB.getSelectedItem());
        texto.setHorizontalAlignment(texto.CENTER); //alinha o campo de texto no centro
        
        //adc ao container
        cont.add(jbl);
        cont.add(cB);
        cont.add(texto);
        
        //item ouvinte
        cB.addItemListener(this);
        
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        texto.setText(""+cB.getSelectedItem());//item selecionado.
    }
    
}
