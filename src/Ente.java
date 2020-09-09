
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
	
	public void anzeigen() {
		System.out.println("I'm a duck!");
	}
	
	public void setFlugverhalten(Flugverhalten fv) {
		flugEigenschaft = fv;
	}
	
	public void fliegenAusfuehren() {
		flugEigenschaft.fliegen();
	}
	
	public void setQuakverhalten(Quakverhalten qv) {
		quakArt = qv;
	}
	
	public void quakenAusfuehren() {
		quakArt.quaken();
	}
}
