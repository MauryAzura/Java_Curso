package ClasesAbstractas;

public class Circulo implements Figura,Rotable,Dibujable{

    private double radio;

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcuarArea() {
        double r = Math.PI*Math.pow(radio, 2);
        return r;
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibijando el cuadrado un circulo");
    }
    
}
