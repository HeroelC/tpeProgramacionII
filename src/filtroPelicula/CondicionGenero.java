package filtroPelicula;

import pelicula.Pelicula;

public class CondicionGenero implements CondicionBusqueda {
private String genero;
	
	public CondicionGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean cumple(Pelicula p) {
		
		return p.contieneGenero(genero);
	}

}
