package Models;
import java.util.ArrayList;
public class Puerto {
  private ArrayList<Barco> puerto;

    public Puerto() {
        this.puerto = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Puerto:" + "\n"+ puerto;
    }

    public void agregarBarco(Barco b){
        if(!puerto.contains(b)){
            puerto.add(b);
        }else{
            System.out.println("Patente registrada");
        }
    }

    public void recolectar(){
        for (Barco b:puerto) {
            if (b instanceof Pesca){
                ((Pesca)b).recolectar();
            }
        }
    }
    public int size(){
        return puerto.size();
    }


    public void getMonto(){
        int cantCorbeta=0;
        int lanchitaAmarilla=0;
        for (Barco b: puerto) {
                if (b instanceof Corbeta){
                    cantCorbeta+=((Corbeta)b).getMonto();
                }else if (b instanceof LanchaAmarilla){
                    lanchitaAmarilla+=((LanchaAmarilla)b).getMonto();
                }
        }
        System.out.println("el total de recaudado por los barcos Corbetas fue de: " + cantCorbeta + " dolares");
        System.out.println("el total de recaudado por los barcos Lancha Amarilla fue de: " + lanchitaAmarilla + " dolares");
        System.out.println("el total de recaudado por los 2 barcos es de:" + (cantCorbeta+lanchitaAmarilla) + " dolares");
    }



}
