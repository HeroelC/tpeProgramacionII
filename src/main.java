import java.util.ArrayList;
import java.util.Iterator;

import condicionUsuario.Condicion;
import condicionUsuario.CondicionTodosGeneros;
import condicionUsuario.CondicionUnGenero;
import filtroPelicula.*;
import gestor.*;
import ordenarPelicula.*;
import pelicula.*;
import usuario.*;

public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// USUARIOS

		Usuario lisa = new Usuario("Lisa", 8);
		lisa.addGeneroPreferido("Rom�ntico");
		lisa.addGeneroPreferido("Musical");
		lisa.addGeneroPreferido("Infantil");
		lisa.addGeneroPreferido("Aventura");

		Usuario bart = new Usuario("Bart", 10);
		bart.addGeneroPreferido("Infantil");
		bart.addGeneroPreferido("Musical");
		bart.addGeneroPreferido("Aventura");
		bart.addGeneroPreferido("Accion");

		Usuario maggie = new Usuario("Maggie", 1);
		maggie.addGeneroPreferido("Musical");
		maggie.addGeneroPreferido("Aventura");
		maggie.addGeneroPreferido("Infantil");

		Usuario marge = new Usuario("Marge", 30);
		marge.addGeneroPreferido("Musical");
		marge.addGeneroPreferido("Aventura");
		marge.addGeneroPreferido("Infantil");
		marge.addGeneroPreferido("Rom�ntico");

		Usuario homero = new Usuario("Homero", 31);
		homero.addGeneroPreferido("Musical");
		homero.addGeneroPreferido("Accion");
		homero.addGeneroPreferido("Infantil");

		// GRUPO DE USUARIOS
		GrupoDeUsuarios hombresSimpson = new GrupoDeUsuarios("Hombres Simpson");

		hombresSimpson.addUser(bart);
		hombresSimpson.addUser(homero);

		GrupoDeUsuarios hermanosSimpson = new GrupoDeUsuarios("Hermanos Simpson");
		hermanosSimpson.addUser(lisa);
		hermanosSimpson.addUser(maggie);
		hermanosSimpson.addUser(bart);

		GrupoDeUsuarios familiaSimpson = new GrupoDeUsuarios("Familia Simpson");
		familiaSimpson.addUser(lisa);
		familiaSimpson.addUser(maggie);
		familiaSimpson.addUser(bart);
		familiaSimpson.addUser(homero);
		familiaSimpson.addUser(marge);

		Pelicula p1 = new Pelicula("Up : una aventura en la altura",
				"Carl Fredricksen es un vendedor de globos de 78 a�os de edad dispuesto a cumplir su sue�o: "
						+ "atar miles de globos a su casa y volar a Sudam�rica. Sin embargo, descubre demasiado tarde a un joven e inesperado poliz�n."
						+ " Lo que en principio ser� recelo, acabar� por tornarse simpat�a hacia el muchacho mientras juntos pasan fascinantes aventuras en ex�ticos lugares.",
				1.4, 2009);
		p1.addDirector("Pete Docter");
		p1.addDirector("Bob Peterson");
		p1.addActor("Pete Docter");
		p1.addActor("Ed Asner");
		p1.addActor("Bob Peterson");
		p1.addActor("Jordan Nagai");
		
		p1.addGenero("Infantil");
		p1.addGenero("Accion");
		p1.addGenero("Drama");

		Pelicula p2 = new Pelicula("Los Simpson",
				" la pel�cula La combinaci�n de Homero (Dan Castellaneta), su nuevo puerco mascota, "
						+ "y un silo lleno de excremento podr�an provocar un desastre que amenace no s�lo a Springfield, sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,"
						+ " dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara para intentar redimirse con la intenci�n de salvar al mundo y ganarse el perd�n de Marge (Julie Kavner).",
				2.0, 2007);

		p2.addDirector("David Silverman");
		p2.addActor("Dan Castellaneta");
		p2.addActor("Harry Shearer");
		p2.addActor("Julie Kavner");
		
		p2.addGenero("Rom�ntico");
		p2.addGenero("Musical");
		p2.addGenero("Infantil");
		p2.addGenero("Aventura");
		p2.addGenero("Comedia");

		Pelicula p3 = new Pelicula("Los Increibles",
				"Un s�per h�roe retirado lucha contra el aburrimiento en un suburbio y junto con su familia tiene la oportunidad de salvar al mundo.\r\n",
				2.0, 2004);

		p3.addDirector("Brad Bird");
		p3.addActor("Brad Bird");
		p3.addActor("Craig T. Nelson");
		p3.addActor("Holly Hunter");
		
		p3.addGenero("Musical");
		p3.addGenero("Infantil");
		p3.addGenero("Aventura");
		p3.addGenero("Accion");

		Pelicula p4 = new Pelicula("Los Increibles 2",
				" Helen entra en acci�n y debe luchar contra un cibercriminal que planea hipnotizar el mundo a trav�s de las pantallas de las computadoras. Eso deja al Sr. Incre�ble con uno de sus mayores desaf�os: quedarse en casa y cuidar de tres ni�os traviesos.\r\n",
				2.0, 2018);

		p4.addDirector("Brad Bird");
		p4.addActor("Brad Bird");
		p4.addActor("Craig T. Nelson");
		p4.addActor("Holly Hunter");
		
		p4.addGenero("Musical");
		p4.addGenero("Infantil");
		p4.addGenero("Aventura");
		p4.addGenero("Accion");

		Pelicula p5 = new Pelicula("Toy Story",
				"Lo mejor de la animaci�n computarizada produce esta historia sobre juguetes que cobran vida cuando su due�o se ausenta.",
				2.0, 1995);

		p5.addDirector("John Lasseter");
		p5.addActor("Tim Allen");
		p5.addActor("Tom Hanks");
		p5.addActor("Don Rickles");
		p5.addActor("Wallace Shawn");
		
		p5.addGenero("Infantil");
		p5.addGenero("Aventura");
		p5.addGenero("Accion");

		Pelicula p6 = new Pelicula("Monsters Inc.",
				"Monsters, Incorporated es la f�brica de sustos m�s grande en el mundo de los"
						+ " monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo "
						+ "grande e intimidante de piel azul, grandes manchas color p�rpura y cuernos. Su asistente, mejor amigo y "
						+ "compa�ero de cuarto es Mike Wazowski (Billy Crystal), un peque�o y alegre monstruo verde con un solo ojo."
						+ " Boo (Mary Gibbs), una ni�a peque�a visita lugares en donde nunca antes hab�a estado un ser humano.\r\n",
				2.0, 2001);

		p6.addDirector("Pete Docter");
		p6.addActor("John Goodman");
		p6.addActor("Billy Crystal");
		p6.addActor("John Ratzenberger");
		
		p6.addGenero("Infantil");
		p6.addGenero("Musical");
		p6.addGenero("Aventura");
		p6.addGenero("Accion");

		// Agregar peliculas al cine
		GestorDePeliculas cine = new GestorDePeliculas();
		cine.agregarPelicula(p1);
		cine.agregarPelicula(p2);
		cine.agregarPelicula(p3);
		cine.agregarPelicula(p4);
		cine.agregarPelicula(p5);
		cine.agregarPelicula(p6);

		// agregar usuarios

		cine.agregarUsuario(lisa);
		cine.agregarUsuario(homero);
		cine.agregarUsuario(bart);
		cine.agregarUsuario(maggie);
		cine.agregarUsuario(marge);
		cine.agregarUsuario(hombresSimpson);
		cine.agregarUsuario(hermanosSimpson);
		cine.agregarUsuario(familiaSimpson);

		// Calificaciones
		lisa.darCalificacion(p3, 5);
		bart.darCalificacion(p3, 2);
		homero.darCalificacion(p3, 4);
		marge.darCalificacion(p3, 2);

		marge.darCalificacion(p4, 5);
		maggie.darCalificacion(p5, 1);

		Condicion conTodosGeneros = new CondicionTodosGeneros();
		Condicion conUnGeneros = new CondicionUnGenero();
		
		CondicionBusqueda f = new CondicionAnio(1980);
		OrdenarPelicula comp = new OrdenarPorPromedio();
		OrdenarPelicula compVoto = new OrdenarPorVotos();
		
		//SETEAMOS TODOS LOS  GENEROS
		cine.setCondicion(conTodosGeneros);
		
		ArrayList<User> usuarios = new ArrayList<>();
		
		//LISTAR PELICULAS VISTAS POR MARGE Y BART
		
		imprimirIterador(bart.listarPeliculasVistas(), bart, "Peliculas vistas por ");
		
		imprimirIterador(marge.listarPeliculasVistas(), marge, "Peliculas vistas por ");
		
		//Pedimos todo los usuarios del cine
		usuarios = cine.getUsuarios();
		
		//Recomendar peliculas con todos los generos
		for(int i=0; i < usuarios.size(); i++) {
			
			imprimirIterador(cine.recomendarPeliculas(usuarios.get(i)), usuarios.get(i), "Recomendar peliculas para");
		}
		
		

	}
	
	public static void imprimirIterador(Iterator<Pelicula> p, User u, String mensaje) {

		
		System.out.println("*********** " + mensaje + u.getNombre() + " ***********");
		
		while(p.hasNext()) {
			
			Pelicula pelicula = p.next();
				
			System.out.println(pelicula.toString());
		}
	}

}
