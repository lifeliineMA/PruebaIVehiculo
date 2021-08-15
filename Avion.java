public class Avion implements IVehiculo {
    int capacidad;
    double longitud;
    String color;
    double precio;
    int Asientos;

    public void arrancarMotor() {
        System.out.println("Motor de Avion Encendido");
    }


    public void detenerMotor() {
        System.out.println("Motor de Avion Apagado");
    }


    public void encenderLuces() {
        System.out.println("Luces de Avion Encendidas");
    }


    public void apagarLuces() {
        System.out.println("Luces de Avion Apagadas");
    }

    public void inicializarAvion(int cap, double lon, String col, int Asientos) {
        this.capacidad = cap;
        this.longitud = lon;
        this.color = col;
        this.precio = 555555; //harcode precio
        this.Asientos = Asientos;
    }




}