package EXERCISM;

public class paraPruebas {

    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.marca = "Audi";
        micoche.arrancar();
        coche.info(); // Llamada al metodo estatico
    }

    public static class coche {
        String marca;

        // normal (No static)
        public void arrancar() {
            System.out.println("El coche " + marca + " ha arrancado");
        }

        // Metodo estatico (static)
        public static void info() {
            System.out.println("Un coche tiene 4 ruedas");
        }
    }
}
