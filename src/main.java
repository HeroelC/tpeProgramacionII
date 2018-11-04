import java.util.Iterator;

import usuario.GrupoDeUsuarios;
import usuario.User;
import usuario.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USUARIOS
		
		Usuario lisa = new Usuario("Lisa", 15);
		lisa.addGeneroPreferido("Romántico");
		lisa.addGeneroPreferido("Musical");
		lisa.addGeneroPreferido("Infantil");

		Iterator<String> listaGeneros = lisa.darGenero();
		
		while(listaGeneros.hasNext()) {
			
			System.out.println(listaGeneros.next());
		}
		
		Usuario bart = new Usuario("Bart", 17);
		bart.addGeneroPreferido("Terror");
		bart.addGeneroPreferido("Batman");
		bart.addGeneroPreferido("Infantil");
		
		//GRUPO DE USUARIOS
		GrupoDeUsuarios simpson = new GrupoDeUsuarios("Simpson");
		
		simpson.addUser(bart);
		simpson.addUser(lisa);
		
		listaGeneros = simpson.darGenero();
		
		System.out.println("**********GRUPO**********");
		while(listaGeneros.hasNext()) {
			
			System.out.println(listaGeneros.next());
		}
	}

}
