package gestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import condicionUsuario.Condicion;
import condicionUsuario.CondicionUnGenero;
import filtroPelicula.*;
import ordenarPelicula.*;
import pelicula.Pelicula;
import usuario.User;

public class GestorDePeliculas {

	// ATRIBUTOS
	private HashSet<Pelicula> peliculas;
	private HashSet<User> usuarios;
	private Condicion c;

	// CONSTRUCTOR
	public GestorDePeliculas() {
		
		peliculas = new HashSet<>();
		usuarios = new HashSet<>();
		//CONDICION POR DEFECTO
		this.c = new CondicionUnGenero();
	}
	
	//CONSTRUCTOR PARA INICIARLIZAR CON UNA CONDICION DE USUARIO (UN GENERO / TODOS)
	public GestorDePeliculas(Condicion c) {
		
		peliculas = new HashSet<>();
		usuarios = new HashSet<>();
		this.c = c;
	}
	
	//SETTERS AND GETTERS

	//CAMBIAR CONDICION (UN GENERO / TODOS LOS GENEROS)
	public void setCondicion(Condicion c) {
		
		this.c = c;
	}
	
	public Condicion getCondicion() {
		
		return c;
	}
	
	public ArrayList<User> getUsuarios(){
		
		ArrayList<User> aux = new ArrayList<>();
		
		Iterator<User> itUser = this.usuarios.iterator();
		
		while(itUser.hasNext()) {
			
			User u = itUser.next();
			
			aux.add(u);
		}
		
		return aux;
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

	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c, OrdenarPelicula ordenamiento, int cantidad) {

		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = recomendarPeliculas(u, c);
		
		int i = 0;

		while (itPeliculas.hasNext()) {
			Pelicula p = itPeliculas.next();
			
			peliculasRecomendadas.add(p);
		}

		Collections.sort(peliculasRecomendadas, ordenamiento);

		i = peliculasRecomendadas.size() - 1;
		
		while (i >= cantidad) {
			i--;
			peliculasRecomendadas.remove(i);
		}

		return peliculasRecomendadas.iterator();
	}


	public HashSet<Pelicula> agregarPeliculasAUnHash(Iterator<Pelicula> p, User u) {
		Iterator<Pelicula> peliculasIterator = listarPeliculasVistas(u);
		HashSet<Pelicula> peliculasHash = new HashSet<>();
		while (peliculasIterator.hasNext()) {
			peliculasHash.add(peliculasIterator.next());
		}
		return peliculasHash;

	}
	
	//RECOMENDAR PELICULA SIN PASAR FILTRO, USA EL QUE SE DEFINIO EN EL CONSTRUCTOR
	public Iterator<Pelicula> recomendarPeliculas(User u){
		
		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = peliculas.iterator();
		
		HashSet<Pelicula> peliculasVistas = agregarPeliculasAUnHash(listarPeliculasVistas(u), u);

		while (itPeliculas.hasNext()) {

			Pelicula p = itPeliculas.next();

			if (c.seCumple(u, p) && !peliculasVistas.contains(p)) {
				peliculasRecomendadas.add(p);
			}
		}

		return peliculasRecomendadas.iterator();
	}

	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c) {

		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = peliculas.iterator();
		
		HashSet<Pelicula> peliculasVistas = agregarPeliculasAUnHash(listarPeliculasVistas(u), u);

		while (itPeliculas.hasNext()) {

			Pelicula p = itPeliculas.next();

			if (c.seCumple(u, p) && !peliculasVistas.contains(p)) {
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

	public Iterator<Pelicula> buscarPeliculas(CondicionBusqueda c) {

		ArrayList<Pelicula> filtroPeliculas = new ArrayList<>();

		Iterator<Pelicula> itPeliculas = peliculas.iterator();

		while (itPeliculas.hasNext()) {

			Pelicula p = itPeliculas.next();
			if (c.cumple(p)) {
				
				filtroPeliculas.add(p);
			}
		}

		return filtroPeliculas.iterator();
	}
	
}
