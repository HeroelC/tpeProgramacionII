package condiciones;
import pelicula.Pelicula;
import usuario.User;
public class CondicionPoseeActor implements Condicion {
	private String actor;
	
	public CondicionPoseeActor(String actor) {
		this.actor = actor;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneActor(actor);
	}

	@Override
	public boolean cumple(Pelicula p, User u) {
		// TODO Auto-generated method stub
		return false;
	}
}
