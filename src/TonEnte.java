import javax.swing.ImageIcon;

public class TonEnte extends Ente {

	public TonEnte(Quakverhalten qv, Flugverhalten fv) {
		super(qv, fv);
	}
	

	@Override
	public String anzeigen() {
		System.out.println("I'm a clay duck!");
		String anzeigen = "res\\tonente.jpg";
		return anzeigen;
	}
}