package ordenamiento;

import java.util.Comparator;

import pelicula.Pelicula;

public class OrdenarPorPromedio extends Comparadores implements Comparator<Pelicula> {

	public int compare(Pelicula p1, Pelicula p2) {
		return (int) (p1.promedioDeVotos() - p2.promedioDeVotos());
	}
}
