package condiciones;

import java.util.HashSet;
import java.util.Iterator;

import pelicula.Pelicula;

public class CondicionGenero extends Condicion {
	private HashSet<String> generos;

	public CondicionGenero() {
		generos = new HashSet<>();
	}

	public boolean cumple(Pelicula p) {
		Iterator<String> it = generos.iterator();
		
		while (it.hasNext()) {
			if(!p.contieneGenero(it.next())) {
				return false;
			}
		}
		return true;
	}
}
