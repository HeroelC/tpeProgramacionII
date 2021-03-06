package filtroPelicula;
import pelicula.Pelicula;

public class CondicionPoseeDirector implements CondicionBusqueda {
	private String director;
	
	public CondicionPoseeDirector(String director) {
		this.director = director;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneDirector(director);
	}

}