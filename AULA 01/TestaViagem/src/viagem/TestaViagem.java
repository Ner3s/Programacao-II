
package viagem;
import java.util.Scanner;
public class TestaViagem {

    
    public static void main(String[] args) {
        Viagem vv = new Viagem ();
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Distancia: ");
        vv.setDistancia(sc.nextFloat());
      
        System.out.print("Combustível: ");
        vv.setCombustivel(sc.nextFloat());
        
        System.out.print("Custo: ");
        vv.setCusto(sc.nextFloat());
        
        System.out.print("Despesa: ");
        vv.setDespesa(sc.nextFloat());
      
        System.out.println("");
        System.out.println("Consumo: "+vv.calcularConsumo());
        System.out.println("Custo: "+vv.calcularCusto());
        System.out.println("CustoKM: "+vv.calcularCustoKm());
      
    }
    
}
