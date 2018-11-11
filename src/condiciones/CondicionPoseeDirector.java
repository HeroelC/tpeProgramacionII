package condiciones;
import pelicula.Pelicula;
import usuario.User;
public class CondicionPoseeDirector implements Condicion {
	private String director;
	
	public CondicionPoseeDirector(String director) {
		this.director = director;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneDirector(director);
	}

	@Override
	public boolean cumple(Pelicula p, User u) {
		// TODO Auto-generated method stub
		return false;
	}
}