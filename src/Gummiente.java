
public class Gummiente extends Ente {

	public Gummiente(Quakverhalten qv, Flugverhalten fv) {
		super(qv, fv);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String anzeigen() {
		System.out.println("I'm a rubber duck!");
		String anzeigen = "res\\gummiente.png";
		return anzeigen;
		
	}

}
