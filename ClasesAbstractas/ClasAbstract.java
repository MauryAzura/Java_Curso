package ClasesAbstractas;

public class ClasAbstract {
    
    public static void main(String[] args) {
        
    Cuadrado a1 = new Cuadrado(0,0,2);

    double r = a1.calcuarArea();

    System.out.println("El area del cuadrado es: "+r);

    //Ciculo

    Circulo a2 = new Circulo(0,0,2);

    r = a2.calcuarArea();

    System.out.println("El area del circulo es: "+r);

    }

}
