package filtroPelicula;

import pelicula.Pelicula;

public interface CondicionBusqueda {
	
public abstract boolean cumple(Pelicula p);

}
