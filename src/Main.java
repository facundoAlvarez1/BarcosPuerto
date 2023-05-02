import Models.Barco;
import Models.Corbeta;
import Models.LanchaAmarilla;
import Models.Puerto;

public class Main {
    public static void main(String[] args) {
        Puerto p = new Puerto();

        p.agregarBarco(new LanchaAmarilla("Marca 1","amarilla pro",2000,200,1234));
        p.agregarBarco(new LanchaAmarilla("Marca 2","amarilla media pro",2000,100,5555));
        p.agregarBarco(new LanchaAmarilla("Marca 3","amarilla sport",2000,150,4444));
        p.agregarBarco(new Corbeta("Corbeta 2","corbetra Pro",300,1264,10));
        p.agregarBarco(new Corbeta("Corbeta 2","corbetra medium",200,1254,8));
        p.agregarBarco(new Corbeta("Corbeta 2","corbetra basica",100,1214,5));

        System.out.println(p.toString()+"\n");

        p.recolectar();
        System.out.println("Los " + p.size() +" barcos Salieron a pescar");
        p.getMonto();

    }
}