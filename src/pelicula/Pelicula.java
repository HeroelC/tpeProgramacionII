package pelicula;

import java.util.HashSet;
import java.util.Iterator;

import calificaciones.Calificacion;

public class Pelicula {

	// ATRIBUTOS
	private String titulo;
	private String sinopsis;
	private HashSet<String> actores;
	private HashSet<String> directores;
	private double duracion;
	private HashSet<String> generos;
	private int anioEstreno;
	private HashSet<Calificacion> calificaciones;

	// CONSTRUCTORES
	public Pelicula(String titulo, String sinopsis, double duracion, int anioEstreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.anioEstreno = anioEstreno;

		// INICIALIZAR COLECCIONES
		this.actores = new HashSet<>();
		this.directores = new HashSet<>();
		this.generos = new HashSet<>();
		this.calificaciones = new HashSet<>();
	}

	// GETTERS and SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	// METODOS
	// Le pasamos la calificacion a una pelicula de un usuario
	public void addCalificacion(Calificacion c) {
		calificaciones.add(c);
	}


	public void addGenero(String genero) {

		generos.add(genero);
	}

	public void addDirector(String director) {

		directores.add(director);
	}

	public void addActor(String actor) {

		actores.add(actor);
	}
	
	public int cantidadCalificaciones() {
		return calificaciones.size();
	}
	
	public double promedioDeVotos() {
		Iterator<Calificacion> it = calificaciones.iterator();
		double promedio = 0;
		while(it.hasNext()) {
			Calificacion c = it.next();
			promedio += c.getCalificacion();
		}
		
	return (promedio/this.cantidadCalificaciones());	
	}
	
	public boolean contieneActor(String actor) {
		return actores.contains(actor);
	}
	
	public boolean contieneDirector(String director) {
		return directores.contains(director);
	}
	
	//Metodos de clase Object
	
	public boolean equals(Pelicula p) {
		return (this.getTitulo().equals(p.getTitulo()));
	}
	
	public boolean contieneGenero(String g) {
		return generos.contains(g);
	}
	
	
}
