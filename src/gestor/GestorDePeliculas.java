package gestor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import condiciones.Condicion;
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
	
	//Falta el limite de peliculas, con el atributo cantidad
	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c, int cantidad) {
		
		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();
		
		Iterator<Pelicula> itPeliculas = peliculas.iterator();
		
		while(itPeliculas.hasNext()) {
			
			if(c.cumple(itPeliculas.next())) {
				
				peliculasRecomendadas.add(itPeliculas.next());
			}
		}
		
		return peliculasRecomendadas.iterator();
	}
	
	public Iterator<Pelicula> recomendarPeliculas(User u, Condicion c){
	
		ArrayList<Pelicula> peliculasRecomendadas = new ArrayList<>();
		
		Iterator<Pelicula> itPeliculas = peliculas.iterator();
		
		while(itPeliculas.hasNext()) {
			
			if(c.cumple(itPeliculas.next())) {
				
				peliculasRecomendadas.add(itPeliculas.next());
			}
		}
		
		return peliculasRecomendadas.iterator();
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
	
	public Iterator<Pelicula> buscarPeliculas(Condicion c){
		
		ArrayList<Pelicula> filtroPeliculas = new ArrayList<>();
		
		Iterator<Pelicula> itPeliculas = peliculas.iterator();
		
		while(itPeliculas.hasNext()) {
			
			if(c.cumple(itPeliculas.next())) {
				
				
			}
		}
		
		return filtroPeliculas.iterator();
	}

}
