package EjercicioAplicado;

public class Squirtle extends Pokemon implements Agua{

    public Squirtle() {
    }
    

    @Override
    public void atacarHidrobomba() {
       System.out.println("Soy squirtle y ataco con hoja afilada");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy squirtle y ataco con pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy squirtle y ataco con burbuja");    
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy squirtle y ataco con hidropulso");  
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy squirtle y ataco con placaje");  
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy squirtle y ataco con arañazo");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy squirtle y ataco con mordisco");  
    }


    
}
