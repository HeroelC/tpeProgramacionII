import java.util.ArrayList;

import usuario.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario lisa = new Usuario("Lisa", 15);
		lisa.addGeneroPreferido("Romántico");
		lisa.addGeneroPreferido("Musical");
		lisa.addGeneroPreferido("Infantil");
		lisa.addGeneroPreferido("Aventura");
		
		ArrayList<String> listaGenero = lisa.darGenero();
		
		for(int i=0; i < listaGenero.size(); i++) {
			
			System.out.println(listaGenero.get(i));
			
		}
	}

}
