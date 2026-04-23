public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, double velocidadMaxima, double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión transporta carga pesada por la vía.");
    }

    @Override
    public double calcularPeaje() {
        return 20000 + (capacidadCarga * 10); 
        // ejemplo: más carga, mayor peaje
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }
}
