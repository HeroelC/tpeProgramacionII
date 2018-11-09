import java.util.Iterator;

import condiciones.Condicion;
import condiciones.CondicionAnio;
import gestor.GestorDePeliculas;
import pelicula.Pelicula;
import usuario.GrupoDeUsuarios;
import usuario.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USUARIOS
		
		Usuario lisa = new Usuario("Lisa", 8);
		lisa.addGeneroPreferido("Romántico");
		lisa.addGeneroPreferido("Musical");
		lisa.addGeneroPreferido("Infantil");
		lisa.addGeneroPreferido("Aventura");

		Iterator<String> listaGeneros = lisa.darGenero();
		
		while(listaGeneros.hasNext()) {
			
			System.out.println(listaGeneros.next());
		}
		
		Usuario bart = new Usuario("Bart", 10);
		bart.addGeneroPreferido("Musical");
		bart.addGeneroPreferido("Aventura");
		bart.addGeneroPreferido("Infantil");
		bart.addGeneroPreferido("Acción");
		
		Usuario maggie = new Usuario("Maggie", 1);
		maggie.addGeneroPreferido("Musical");
		maggie.addGeneroPreferido("Aventura");
		maggie.addGeneroPreferido("Infantil");
		
		Usuario marge = new Usuario("Marge", 30);
		marge.addGeneroPreferido("Musical");
		marge.addGeneroPreferido("Aventura");
		marge.addGeneroPreferido("Infantil");
		marge.addGeneroPreferido("Romántico");
		
		Usuario homero = new Usuario("Homero", 31);
		homero.addGeneroPreferido("Musical");
		homero.addGeneroPreferido("Accion");
		homero.addGeneroPreferido("Infantil");
		
		
		//GRUPO DE USUARIOS
		GrupoDeUsuarios hombresSimpson = new GrupoDeUsuarios("Simpson");
		
		hombresSimpson.addUser(bart);
		hombresSimpson.addUser(lisa);
		
		Pelicula p1 = new Pelicula("Up : una aventura en la altura","Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su sueño: "
				+ "atar miles de globos a su casa y volar a Sudamérica. Sin embargo, descubre demasiado tarde a un joven e inesperado polizón."
				+ " Lo que en principio será recelo, acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes aventuras en exóticos lugares.",1.4,2009);
		p1.addDirector("Pete Docter");
		p1.addDirector("Bob Peterson");
		p1.addActor("Pete Docter");
		p1.addActor("Ed Asner");
		p1.addActor("Bob Peterson");
		p1.addActor("Jordan Nagai");
		p1.addGenero("Infantil");
		p1.addGenero("Accion");
		p1.addGenero("Drama");


		Pelicula p2 = new Pelicula(" Los Simpson"," la película La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, "
				+ "y un silo lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield, sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,"
				+ " dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de Marge (Julie Kavner).",
				2.0, 2007);
		
		p2.addDirector("David Silverman");
		p2.addActor("Dan Castellaneta");
		p2.addActor("Harry Shearer");
		p2.addActor("Julie Kavner");
		p2.addGenero("Romantico");
		p2.addGenero("Musical");
		p2.addGenero("Infantil");
		p2.addGenero("Aventura");
		p2.addGenero("Comedia");
		
		Pelicula p3 = new Pelicula("Los Increibles","Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su familia tiene la oportunidad de salvar al mundo.\r\n"
				,2.0, 2004);
		
		p3.addDirector("Brad Bird");
		p3.addActor("Brad Bird");
		p3.addActor("Craig T. Nelson");
		p3.addActor("Holly Hunter");
		p3.addGenero("Musical");
		p3.addGenero("Infantil");
		p3.addGenero("Aventura");
		p3.addGenero("Accion");
		
		Pelicula p4 = new Pelicula("Los Increibles 2"," Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el mundo a través de las pantallas de las computadoras. Eso deja al Sr. Increíble con uno de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.\r\n"
				,2.0, 2018);
		
		p4.addDirector("Brad Bird");
		p4.addActor("Brad Bird");
		p4.addActor("Craig T. Nelson");
		p4.addActor("Holly Hunter");
		p4.addGenero("Musical");
		p4.addGenero("Infantil");
		p4.addGenero("Aventura");
		p4.addGenero("Accion");
		
		
		Pelicula p5 = new Pelicula("Toy Story","Lo mejor de la animación computarizada produce esta historia sobre juguetes que cobran vida cuando su dueño se ausenta.",
				2.0, 1995);
		
		p5.addDirector("John Lasseter");
		p5.addActor("Tim Allen");
		p5.addActor("Tom Hanks");
		p5.addActor("Don Rickles");
		p5.addActor("Wallace Shawn");
		p5.addGenero("Infantil");
		p5.addGenero("Aventura");
		p5.addGenero("Accion");
		
		Pelicula p6 = new Pelicula("Monsters Inc.","Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los"
				+ " monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo "
				+ "grande e intimidante de piel azul, grandes manchas color púrpura y cuernos. Su asistente, mejor amigo y "
				+ "compañero de cuarto es Mike Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo."
				+ " Boo (Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un ser humano.\r\n"
				,2.0, 2001);
		
		p6.addDirector("Pete Docter");
		p6.addActor("John Goodman");
		p6.addActor("Billy Crystal");
		p6.addActor("John Ratzenberger");
		p6.addGenero("Infantil");
		p6.addGenero("Musical");
		p6.addGenero("Aventura");
		p6.addGenero("Accion");
		
		//homero.darCalificacion(p3, 4);
		marge.darCalificacion(p3, 2);
		
		marge.darCalificacion(p4, 5);
		
		maggie.darCalificacion(p5, 1);
		
		
		GestorDePeliculas cine = new GestorDePeliculas();
		cine.agregarPelicula(p1);
		cine.agregarPelicula(p2);
		cine.agregarPelicula(p3);
		cine.agregarPelicula(p4);
		cine.agregarPelicula(p5);
		cine.agregarPelicula(p6);
		
		hombresSimpson.darCalificacion(p5, 1);
		hombresSimpson.darCalificacion(p6, 3);
		hombresSimpson.darCalificacion(p3, 5);
		
		cine.agregarUsuario(hombresSimpson);
		
		Condicion c = new CondicionAnio(1956);
		
		Iterator <Pelicula> itPeliculaHomero = cine.recomendarPeliculas(hombresSimpson, c);
		
		System.out.println("******PELICULAS VISTAS CINE********");
		while(itPeliculaHomero.hasNext()) {
			
			System.out.println(itPeliculaHomero.next().getTitulo());
		}
		
	}

}
