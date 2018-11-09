package gestor;

import java.util.HashSet;
import java.util.Iterator;

import pelicula.Pelicula;
import usuario.User;

public class GestorDePeliculas {
	
	//ATRIBUTOS
	private HashSet<Pelicula> peliculas;
	private HashSet<User> usuarios;

	public GestorDePeliculas() {
		peliculas = new HashSet<>();
		usuarios = new HashSet<>();
	}

	public void agregarPelicula(Pelicula p) {
		peliculas.add(p);
	}

	public void agregarUsuario(User u) {
		usuarios.add(u);
	}

	public int cantidadDeVotos(Pelicula p) {
		
		return p.cantidadCalificaciones();
	}

	public double puntajePromedio(Pelicula p) {
		return p.promedioDeVotos();
	}
	//traer metodos de recomendar
	public HashSet<Pelicula> recomendarPeliculaUsuario(User u) {
		
		HashSet<Pelicula> peliculasRecomendadas = new HashSet<>();
		Iterator<Pelicula> it = peliculas.iterator();

		return peliculasRecomendadas;
	}

}
