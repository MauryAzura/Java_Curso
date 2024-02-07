package EjercicioAplicado;

public class Charmander extends Pokemon implements Fuego{

    public Charmander() {
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y ataco con Puño de fuego");
    }

    @Override
    public void atacarAscuas() {
       System.out.println("Soy charmander y ataco con ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y ataco con lanza llamas");
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander y ataco con placaje");  
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy charmander y ataco con arañazo");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy charmander y ataco con mordisco");  
    }
    
    


}
