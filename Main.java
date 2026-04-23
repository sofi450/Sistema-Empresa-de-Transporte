public class Main {
    public static void main(String[] args) {

        // Crear objetos
        Carro carro = new Carro("ABC123", "Toyota", 180, 4);
        Moto moto = new Moto("XYZ789", "Yamaha", 140, "Deportiva");
        Camion camion = new Camion("LMN456", "Volvo", 120, 8000);

        // Uso de métodos
        System.out.println("=== CARRO ===");
        carro.mostrarInfo();
        carro.mover();
        System.out.println("Peaje: $" + carro.calcularPeaje());

        System.out.println("\n=== MOTO ===");
        moto.mostrarInfo();
        moto.mover();
        System.out.println("Peaje: $" + moto.calcularPeaje());

        System.out.println("\n=== CAMIÓN ===");
        camion.mostrarInfo();
        camion.mover();
        System.out.println("Peaje: $" + camion.calcularPeaje());
    }
}
