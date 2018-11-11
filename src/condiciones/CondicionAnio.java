package condiciones;
import pelicula.Pelicula;
import usuario.User;

public class CondicionAnio implements Condicion{
	private int anio;
	
	public CondicionAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno() >= anio;
	}

	@Override
	public boolean cumple(Pelicula p, User u) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
