package gestor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import ordenamiento.OrdenarPorPromedio;
import ordenamiento.OrdenarPorVotos;
import pelicula.Pelicula;
import usuario.User;

public class GestorDePeliculas {
	
	//ATRIBUTOS
	private HashSet<Pelicula> peliculas;
	private HashSet<User> usuarios;

	//CONSTRUCTOR
	public GestorDePeliculas() {
		peliculas = new HashSet<>();
		usuarios = new HashSet<>();
	}

	//METODOS
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
	
	public Iterator<Pelicula> listarPeliculasVistas(User u){
		
		ArrayList<Pelicula> peliculasVistas = new ArrayList<>();
		
		Iterator<Pelicula> peliculas = u.listarPeliculasVistas();
		
		while(peliculas.hasNext()) {
			
			peliculasVistas.add(peliculas.next());
		}
		
		Collections.sort(peliculasVistas, new OrdenarPorPromedio());
		
		return peliculasVistas.iterator();
	}

}
