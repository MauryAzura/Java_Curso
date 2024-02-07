package EjercicioAplicado;

public class Pikachu extends Pokemon implements Electrico{

    public Pikachu() {
    }

	@Override
	public void atacarImpactrueno() {
		System.out.println("Soy pikachu y ataco con impact trueno");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy pikachu y ataco con puño trueno");
	}

	@Override
	public void atacarRayo() {
		System.out.println("Soy pikachu y ataco con rayo");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Soy pikachu y ataco con rayo carga");
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy pikachu y ataco con placaje");
	}

	@Override
	protected void atacarArañazo() {
		System.out.println("Soy pikachu y ataco con arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy pikachu y ataco con mordisco");
	}
    
}
