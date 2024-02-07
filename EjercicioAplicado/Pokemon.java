package EjercicioAplicado;

public abstract class Pokemon {
    
    protected int pokedex_num;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();

    protected abstract void atacarArañazo();

    protected abstract void atacarMordisco();

}
