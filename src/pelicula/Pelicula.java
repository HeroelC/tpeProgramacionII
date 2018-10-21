package pelicula;

import java.util.ArrayList;

import calificaciones.Calificacion;

public class Pelicula {
	
	//Atributos
	private String titulo;
	private String sinopsis;
	private ArrayList<String> actores; 
	private ArrayList<String> directores;
	private double duracion; 
	private ArrayList<String> generos; 
	private int anioEstreno;
	private ArrayList<Calificacion> calificaciones;
	
	public Pelicula(String titulo, String sinopsis) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
	}
	
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
	
}
