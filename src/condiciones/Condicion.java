package condiciones;

import pelicula.Pelicula;
import usuario.User;

public interface Condicion {
	
public abstract boolean cumple(Pelicula p);
public abstract boolean cumple(Pelicula p, User u);

}
