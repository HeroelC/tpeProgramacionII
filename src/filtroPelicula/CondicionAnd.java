package filtroPelicula;
import pelicula.Pelicula;

public class CondicionAnd implements CondicionBusqueda{
	
	private CondicionBusqueda c1;
	private CondicionBusqueda c2;
	
	public CondicionAnd(CondicionBusqueda c1, CondicionBusqueda c2) {
		
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(Pelicula p) {
		
		return c1.cumple(p) && c2.cumple(p);
	}	
}
