public class Moto implements IVehiculo{

    String patente;
    int anio;
    String color;

    public void arrancarMotor() {
        System.out.println("Motor de Moto Encendido.");

    }

    public void detenerMotor() {
        System.out.println("Motor de Moto Apagado.");

    }

    public void encenderLuces() {
        System.out.println("Luces de Moto Encendidas.");

    }

    public void apagarLuces() {
        System.out.println("Luces de Moto Apagadas.");

    }

    public void inicializarMoto(String pat, int yy, String col) {
        this.patente = pat;
        this.anio = yy;
        this.color = col;

    }
}
