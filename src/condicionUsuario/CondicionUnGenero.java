package condicionUsuario;

import java.util.Iterator;
import pelicula.Pelicula;
import usuario.User;

public class CondicionUnGenero implements Condicion {

	public boolean seCumple(User u, Pelicula p) {
		Iterator<String> itGeneros = u.darGenero();

		while (itGeneros.hasNext()) {
			if (p.contieneGenero(itGeneros.next())) {
				return true;
			}
		}
		return false;
	}
}
