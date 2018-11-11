package condiciones;

import java.util.Iterator;

import pelicula.Pelicula;
import usuario.User;

public class CondicionUnGenero implements Condicion {

	public boolean cumple(Pelicula p) {
		return false;
	}

	@Override
	public boolean cumple(Pelicula p, User u) {
		Iterator<String> itGeneros = u.darGenero();

		while (itGeneros.hasNext()) {
			if (p.contieneGenero(itGeneros.next())) {
				return true;
			}
		}
		return false;
	}
}
