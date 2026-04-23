public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String placa, String marca, double velocidadMaxima, int numeroPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El carro se desplaza por la carretera con 4 ruedas.");
    }

    @Override
    public double calcularPeaje() {
        return 10000; // tarifa fija ejemplo
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
