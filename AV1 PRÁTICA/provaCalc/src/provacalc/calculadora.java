package provacalc;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class calculadora extends JFrame implements ActionListener {
    
    JTextField txtNum;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPonto, btnMultiplica, btnDivisao, btnSoma, btnDiminui, btnIgual;
    
    public calculadora(){
        super("Calculator");
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        txtNum = new JTextField(13);
        txtNum.setEnabled(false);
        p1.add(txtNum);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,4));
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDivisao = new JButton("/");
        
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnMultiplica = new JButton("*");
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnDiminui = new JButton("-");
        
        btn0 = new JButton("0");
        btnPonto = new JButton(".");
        btnIgual = new JButton("=");
        btnSoma = new JButton("+");
        
        p2.add(btn7);
        p2.add(btn8);
        p2.add(btn9);
        p2.add(btnDivisao);
        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);
        p2.add(btnMultiplica);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btnDiminui);
        p2.add(btn0);
        p2.add(btnPonto);
        p2.add(btnIgual);
        p2.add(btnSoma);
        
        c.add(p1);
        c.add(p2);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
}
