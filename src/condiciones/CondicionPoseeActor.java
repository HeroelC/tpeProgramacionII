package condiciones;
import pelicula.Pelicula;
public class CondicionPoseeActor extends Condicion {
	private String actor;
	
	public CondicionPoseeActor(String actor) {
		this.actor = actor;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneActor(actor);
	}
}
