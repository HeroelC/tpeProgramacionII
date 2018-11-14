package ordenarPelicula;

import java.util.Comparator;

import pelicula.Pelicula;

public abstract class OrdenarPelicula implements Comparator<Pelicula>{

	public abstract int compare(Pelicula p1, Pelicula p2);
	
}
