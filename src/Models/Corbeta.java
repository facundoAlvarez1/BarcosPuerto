package Models;

import java.util.Random;

public class Corbeta extends Barco implements Pesca{
    private int cantJaula;
    private static final int capacJaula=10;
    private int recolectado;

    public Corbeta() {
    }
      public Corbeta(String marca, String modelo, int capacCombustible, int patente, int cantJaula) {
        super(marca, modelo, capacCombustible,(cantJaula*capacJaula), patente);
        this.cantJaula = cantJaula;
    }

    public int getCantJaula() {
        return cantJaula;
    }

    public void setCantJaula(int cantJaula) {
        this.cantJaula = cantJaula;
    }

    public int getCapacJaula() {
        return capacJaula;
    }

    @Override
    public String toString() {
        return "Corbeta:" +
                "cantJaula=" + cantJaula +
                "capacJaula=" + capacJaula + super.toString()+"\n";
    }

    @Override
    public void recolectar() {
        Random r =new Random();
        recolectado=r.nextInt(getCapcCarga());
    }

    @Override
    public int getMonto() {
        return recolectado*11;
    }
}
