package ordenarPelicula;

import java.util.Comparator;

import pelicula.Pelicula;

public class OrdenarPorVotos extends OrdenarPelicula implements Comparator<Pelicula>{

	public int compare(Pelicula p1, Pelicula p2) {
		return p1.cantidadCalificaciones() - p2.cantidadCalificaciones();
	}
}
