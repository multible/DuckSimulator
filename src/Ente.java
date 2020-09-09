
public class Ente{

	private Flugverhalten flugEigenschaft;
	private Quakverhalten quakArt;

	public Ente(Quakverhalten qv, Flugverhalten fv) {
		quakArt = qv;
		flugEigenschaft = fv;
	}

	public void schwimmen() {
		System.out.println("See the duck swimming?");
	}
	
	public String anzeigen() {
		System.out.println("I'm a duck!");
		String anzeigen = "res\\ente.png";
		return anzeigen;
	}
	
	public void setFlugverhalten(Flugverhalten fv) {
		flugEigenschaft = fv;
	}
	
	public String fliegenAusfuehren() {
		return flugEigenschaft.fliegen();
	}
	
	public void setQuakverhalten(Quakverhalten qv) {
		quakArt = qv;
	}
	
	public String quakenAusfuehren() {
		return quakArt.quaken();
	}
}
