package Models;

import java.util.Random;

public class LanchaAmarilla extends Barco implements Pesca{
    private static int capacRecoleccion =20;
    private int recolectado;

    public LanchaAmarilla() {
    }

    public LanchaAmarilla(int capacRecoleccion) {
        this.capacRecoleccion = capacRecoleccion;
    }

    public LanchaAmarilla(String marca, String modelo, int capacCombustible, int capcCarga, int patente) {
        super(marca, modelo, capacCombustible, capcCarga, patente);
          }

    public int getCapacRecoleccion() {
        return capacRecoleccion;
    }

    public void setCapacRecoleccion(int capacRecoleccion) {
        this.capacRecoleccion = capacRecoleccion;
    }

    @Override
    public String toString() {
        return "LanchaAmarilla:" +
                "capacRecoleccion="  + super.toString()+"Capacidad de carga por hora : " + capacRecoleccion +
                "\n";
    }


    @Override
    public void recolectar() {
        int recolectado=0;
        Random random = new Random();
        for (int i=0; i < 12 && recolectado <=this.getCapcCarga();i++){
            recolectado +=random.nextInt(20);
        }
        if(recolectado >= this.getCapcCarga()){
            this.recolectado = getCapcCarga();
        }else{
            this.recolectado=recolectado;
        }
    }

    @Override
    public int getMonto() {
        return recolectado*11;
    }
}
