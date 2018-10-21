package usuario;

import java.util.ArrayList;

public class GrupoDeUsuarios extends User{

	ArrayList<User> usuarios;
	
	//CONSTRUCTOR
	public GrupoDeUsuarios(String nombre) {
		
		super(nombre);
		this.usuarios = new ArrayList<>(); //Inicializamos el ArrayList de usuarios
	}
	
	//METODOS
	public ArrayList<String> darGenero(){
		
		ArrayList<String> generos = new ArrayList<>(); //Arreglo adicional para retornar
		
		for(int i=0; i<usuarios.size(); i++) {
			
			ArrayList<String> copiaGeneros = usuarios.get(i).darGenero(); //Pedimos los generos
			
			//Recorremos el ArrayList de generos
			for(int j=0; j<copiaGeneros.size(); i++) {
				
				//Si el ArrayList que vamos a devoler no contiene el genero lo agregamos
				if(!generos.contains(copiaGeneros.get(j))) {
					generos.add(copiaGeneros.get(j));
				}
			}
		}
		
		return generos;
	}
}
