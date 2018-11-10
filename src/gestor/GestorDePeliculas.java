package gestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import condiciones.*;
import ordenamiento.*;
import pelicula.Pelicula;
import usuario.User;

public class GestorDePeliculas {

	// ATRIBUTOS
	private HashSet<Pelicula> peliculas;
	private HashSet<User> usuarios;

	// CONSTRUCTOR
	public GestorDePeliculas() {
		peliculas = new HashSet<>();
		usuarios = new HashSet<>();
	}

	// METODOS
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

	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c, Comparadores ordenamiento, int cantidad) {

		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();
		
		Iterator<Pelicula> itPeliculas = recomendarPeliculas(u, c);
		
		int i = 0;
		
		while (itPeliculas.hasNext()) {
				peliculasRecomendadas.add(itPeliculas.next());
		}

		Collections.sort(peliculasRecomendadas, ordenamiento);

		i = peliculasRecomendadas.size() - 1;

		while (i >= cantidad) {
			i--;
			peliculasRecomendadas.remove(i);
		}

		return peliculasRecomendadas.iterator();
	}

	public boolean recorrerPeliculasVistas(Pelicula vista, User u) {
		Iterator<Pelicula> peliculasVistas = listarPeliculasVistas(u);
		HashSet<Pelicula> peliculasVista = new HashSet<>();

		while (peliculasVistas.hasNext()) {
			peliculasVista.add(peliculasVistas.next());
		}
		
		return peliculasVista.contains(vista);
	}

	// FALTA QUE LA PELICULA NO ESTE VISTA POR TODO LOS MIEMBROS
	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c) {

		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = peliculas.iterator();

		Pelicula p;

		while (itPeliculas.hasNext()) {

			p = itPeliculas.next();

			if (c.cumple(p)  && !recorrerPeliculasVistas(p, u)) {

				peliculasRecomendadas.add(p);
			}
		}

		return peliculasRecomendadas.iterator();
	}

	public Iterator<Pelicula> listarPeliculasVistas(User u) {

		ArrayList<Pelicula> peliculasVistas = new ArrayList<>();

		Iterator<Pelicula> peliculas = u.listarPeliculasVistas();

		while (peliculas.hasNext()) {

			peliculasVistas.add(peliculas.next());
		}

		return peliculasVistas.iterator();
	}

	public Iterator<Pelicula> buscarPeliculas(Condicion c) {

		ArrayList<Pelicula> filtroPeliculas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = peliculas.iterator();

		Pelicula p;

		while (itPeliculas.hasNext()) {

			p = itPeliculas.next();

			if (c.cumple(p)) {

				filtroPeliculas.add(p);
			}
		}

		return filtroPeliculas.iterator();
	}

}
