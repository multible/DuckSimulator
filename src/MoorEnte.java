
public class MoorEnte extends Ente {

	public MoorEnte(Quakverhalten qv, Flugverhalten fv) {
		super(qv, fv);
				}
	
	@Override
	public String anzeigen() {
		System.out.println("I'm a swamp duck!");
		String anzeigen = "res\\moorente.jpg";
		return anzeigen;
	
	}

}
