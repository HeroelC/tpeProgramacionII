package condicionUsuario;

import pelicula.Pelicula;
import usuario.User;

public interface Condicion {

	public abstract boolean seCumple(User u, Pelicula p);
}
