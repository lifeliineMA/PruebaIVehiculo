
public class Auto implements IVehiculo {

    String patente;
    int anio;
    String color;
    double precio;


    public void arrancarMotor() {
        System.out.println("Motor de Auto Encendido.");

    }

    public void detenerMotor() {
        System.out.println("Motor de Auto Apagado.");

    }

    public void encenderLuces() {
        System.out.println("Luces de Auto Encendidas.");

    }

    public void apagarLuces() {
        System.out.println("Luces de Auto Apagadas.");

    }

    public void inicializarAuto(String pat, int yy, String col, double price) {
        this.patente = pat;
        this.anio = yy;
        this.color = col;
        this.precio = price;
    }


}