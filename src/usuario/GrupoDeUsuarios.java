package usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import calificaciones.Calificacion;
import pelicula.Pelicula;
import java.util.HashSet;

public class GrupoDeUsuarios extends User {

	//ATRIBUTOS
	HashSet<User> usuarios;

	//CONSTRUCTOR
	public GrupoDeUsuarios(String nombre) {

		super(nombre);
		this.usuarios = new HashSet<>(); // Inicializamos el ArrayList de usuarios
	}

	//METODOS ABSTRACTS
	public Iterator<String> darGenero() {
		
		HashSet<String> salidaGeneros = new HashSet<String>();
		Iterator<User> itUsuarios = usuarios.iterator();
		
		while(itUsuarios.hasNext()) {
			
			Iterator<String> itGeneros = itUsuarios.next().darGenero(); 
			
			while(itGeneros.hasNext()) {
				
				salidaGeneros.add(itGeneros.next());
			}
		}
		
		return salidaGeneros.iterator();
	}

	public Iterator<Pelicula> listarPeliculasVistas() {

		HashSet<Pelicula> salidaPeliculas = new HashSet<>();

		Iterator<User> itUsuarios = usuarios.iterator();
		
		while(itUsuarios.hasNext()) {
			
			Iterator<Pelicula> itPeliculas = itUsuarios.next().listarPeliculasVistas(); 
			
			while(itPeliculas.hasNext()) {
				
				salidaPeliculas.add(itPeliculas.next());
			}
		}
		
		return salidaPeliculas.iterator();
	}
	
	//METODOS
	public void addUser(User u) {
		usuarios.add(u);
	}
}
