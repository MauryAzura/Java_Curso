package ClasesAbstractas;

public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado() {}

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcuarArea() {
        double r = lado*lado;
        return r;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibijando el cuadrado");
    }
 
}
