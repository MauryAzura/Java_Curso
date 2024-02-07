package EjercicioAplicado;

public class Bulbasar extends Pokemon implements Planta{

    public Bulbasar() {
    }

    @Override
    public void atacarParalizar() {
       System.out.println("Soy bulbasar y ataco con paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasar y ataco con drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy bulbasar y ataco con hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy bulbasar y ataco con latigo cepa");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy bulbasar y ataco con placaje");  
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy bulbasar y ataco con arañazo");  
    }

	@Override
    protected void atacarMordisco() {
        System.out.println("Soy bulbasar y ataco con mordisco");  
    }

    
    
    
}
