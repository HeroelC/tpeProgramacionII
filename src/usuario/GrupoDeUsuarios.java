package usuario;

import java.util.HashSet;
import java.util.Iterator;
import pelicula.Pelicula;

public class GrupoDeUsuarios extends User {

	// ATRIBUTOS
	HashSet<User> usuarios;

	// CONSTRUCTOR
	public GrupoDeUsuarios(String nombre) {
		super(nombre);
		this.usuarios = new HashSet<>(); // Inicializamos el ArrayList de usuarios
	}

	// METODOS ABSTRACTS
	public void darCalificacion(Pelicula p, int calificacion) {
		
	}
	
	public Iterator<String> darGenero() {

		HashSet<String> salidaGeneros = new HashSet<String>();
		Iterator<User> itUsuarios = usuarios.iterator();

		while (itUsuarios.hasNext()) {

			Iterator<String> itGeneros = itUsuarios.next().darGenero();

			while (itGeneros.hasNext()) {

				salidaGeneros.add(itGeneros.next());
			}
		}

		return salidaGeneros.iterator();
	}

	public Iterator<Pelicula> listarPeliculasVistas() {

		HashSet<Pelicula> salidaPeliculas = new HashSet<>();

		Iterator<User> itUsuarios = usuarios.iterator();

		while (itUsuarios.hasNext()) {

			Iterator<Pelicula> itPeliculas = itUsuarios.next().listarPeliculasVistas();

			while (itPeliculas.hasNext()) {

				salidaPeliculas.add(itPeliculas.next());
			}
		}

		return salidaPeliculas.iterator();
	}
	
	public boolean contieneGeneros(Pelicula p) {
		Iterator<String> it = darGenero();

		while (it.hasNext()) {
			if (!p.contieneGenero(it.next())) {
				return false;
			}
		}
		return true;
	}
	
	public boolean contieneGenero(Pelicula p) {
		Iterator<String> it = darGenero();

		while (it.hasNext()) {
			if (p.contieneGenero(it.next())) {
				return true;
			}
		}

		return false;
	}
	
	public boolean vioPelicula(Pelicula p) {
		Iterator<Pelicula> itPelicula = listarPeliculasVistas();
		while (itPelicula.hasNext()) {
			if (itPelicula.next().equals(p)) {
				return true;
			}
		}
		return false;
	}

	// METODOS
	public void addUser(User u) {
		usuarios.add(u);
	}
}
