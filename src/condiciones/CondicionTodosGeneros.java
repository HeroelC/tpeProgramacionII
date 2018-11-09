package condiciones;

import java.util.Iterator;

import pelicula.Pelicula;

public class CondicionTodosGeneros implements Condicion{

	private Iterator<String> generos;
	
	public CondicionTodosGeneros(Iterator<String> generos) {
		
		this.generos = generos;
	}
	
	public boolean cumple(Pelicula p) {
		
		Iterator<String> itGeneros = generos;
		
		while (itGeneros.hasNext()) {
			if(!p.contieneGenero(itGeneros.next())) {
				return false;
			}
		}
		return true;
	}
	
}
