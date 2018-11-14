package ordenarPelicula;

import java.util.Comparator;

import pelicula.Pelicula;

public class OrdenarPorPromedio extends OrdenarPelicula implements Comparator<Pelicula> {

	public int compare(Pelicula p1, Pelicula p2) {
		return (int) (p2.promedioDeVotos() - p1.promedioDeVotos());
	}
}
