package condicionUsuario;

import java.util.Iterator;

import condicionesBusqueda.Condicion;
import pelicula.Pelicula;
import usuario.User;

public class CondicionTodosGeneros implements Condicion {

	public boolean cumple(Pelicula p, User u) {

		Iterator<String> itGeneros = u.darGenero();

		while (itGeneros.hasNext()) {
			if (!p.contieneGenero(itGeneros.next())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean cumple(Pelicula p) {
		// TODO Auto-generated method stub
		return false;
	}
}
