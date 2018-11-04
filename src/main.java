import java.util.ArrayList;
import java.util.Iterator;

import usuario.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario lisa = new Usuario("Lisa", 15);
		lisa.addGeneroPreferido("Romántico");
		lisa.addGeneroPreferido("Musical");
		lisa.addGeneroPreferido("Infantil");
		lisa.addGeneroPreferido("Aventura");
		
		Iterator<String> listaGeneros = lisa.darGenero();
		
		while(listaGeneros.hasNext()) {
			
			System.out.println(listaGeneros.next());
		}
	}

}
