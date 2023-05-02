package Models;

public class Barco {
    private String marca;
    private String modelo;
    private int capacCombustible;
    private int capcCarga;
    private int patente;

    public Barco() {
    }

    public Barco(String marca, String modelo, int capacCombustible, int capcCarga, int patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacCombustible = capacCombustible;
        this.capcCarga = capcCarga;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacCombustible() {
        return capacCombustible;
    }

    public void setCapacCombustible(int capacCombustible) {
        this.capacCombustible = capacCombustible;
    }

    public int getCapcCarga() {
        return capcCarga;
    }

    public void setCapcCarga(int capcCarga) {
        this.capcCarga = capcCarga;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacCombustible=" + capacCombustible +
                ", capcCarga=" + capcCarga +
                ", patente=" + patente +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
