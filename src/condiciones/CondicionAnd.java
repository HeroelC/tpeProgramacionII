package condiciones;
import pelicula.Pelicula;
import usuario.User;
public class CondicionAnd implements Condicion{
	
	private Condicion c1;
	private Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(Pelicula p) {
		
		return c1.cumple(p) && c2.cumple(p);
	}

	@Override
	public boolean cumple(Pelicula p, User u) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
