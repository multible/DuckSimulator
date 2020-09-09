
public class Main {
	public static void main(String[] args) {
		Ente ente = new StockEnte(new Quaken(), new Fluegelschlagen());
		ente.fliegenAusfuehren();
		ente.quakenAusfuehren();
	}
}
