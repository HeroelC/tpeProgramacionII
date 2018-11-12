package condicionesBusqueda;
import pelicula.Pelicula;

public class CondicionPoseeActor implements Condicion {
	private String actor;
	
	public CondicionPoseeActor(String actor) {
		this.actor = actor;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneActor(actor);
	}

}
