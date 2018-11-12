package condicionesBusqueda;
import pelicula.Pelicula;

public class CondicionAnio implements CondicionBusqueda{
	private int anio;
	
	public CondicionAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno() >= anio;
	}

}
