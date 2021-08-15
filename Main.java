public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto();
        System.out.println("\n");
        auto1.arrancarMotor();
        auto1.encenderLuces();
        auto1.apagarLuces();
        auto1.detenerMotor();

        Avion avion1 = new Avion();
        System.out.println("\n\n");
        avion1.arrancarMotor();
        avion1.encenderLuces();
        avion1.apagarLuces();
        avion1.detenerMotor();

        Moto moto1 = new Moto();
        System.out.println("\n\n");
        moto1.arrancarMotor();
        moto1.encenderLuces();
        moto1.apagarLuces();
        moto1.detenerMotor();


        avion1.inicializarAvion(500, 200.45, "Verde",48);
        auto1.inicializarAuto("AEF455", 1998, "Azul", 6580000);
        moto1.inicializarMoto("ABV",2344,"Negro");

        System.out.println("INFO Auto");
        System.out.println("Patente: " + auto1.patente);
        System.out.println("Año: " + auto1.anio);
        System.out.println("Color: " + auto1.color);
        System.out.println("Precio: " + auto1.precio);
        System.out.println(avion1.precio);
        avion1.precio = 9999;
        System.out.println(avion1.precio);
    }
}