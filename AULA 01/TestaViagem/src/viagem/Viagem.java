
package viagem;

import javax.swing.*;


public class Viagem extends JFrame  {
    public Viagem(){
        setSize(300,100);
        setTitle("Cadastro de Categorias");
        setLocation(150,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setLayout(null);

        JLabel meuLabel = new JLabel(Float.toString(calcularConsumo()));
        meuLabel.setBounds(10,10,60,20);
        
    }
    private float distancia;
    private float combustivel;
    private float custo;
    private float despesa;

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getDespesa() {
        return despesa;
    }

    public void setDespesa(float despesa) {
        this.despesa = despesa;
    }
    
    public float calcularConsumo(){
        
        return getDistancia()/getCombustivel();
       
    }
    public float calcularCusto(){
        return getDespesa() + getCusto();
    }
    public float calcularCustoKm(){
        return calcularCusto()/getDistancia();
    }
}
