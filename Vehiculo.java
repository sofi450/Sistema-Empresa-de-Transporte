public class Vehiculo {
    protected String placa;
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String placa, String marca, double velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }

    public double calcularPeaje() {
        return 0; // valor base
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }
}
