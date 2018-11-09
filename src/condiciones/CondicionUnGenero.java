package condiciones;

import java.util.HashSet;
import java.util.Iterator;

import pelicula.Pelicula;

public class CondicionUnGenero implements Condicion {
	private Iterator<String> generos;

	public CondicionUnGenero(Iterator<String> generos) {
		this.generos = generos;
	}

	public boolean cumple(Pelicula p) {
		
		Iterator<String> itGeneros = generos;
		
		while (itGeneros.hasNext()) {
			if(p.contieneGenero(itGeneros.next())) {
				return true;
			}
		}
		return false;
	}
}
