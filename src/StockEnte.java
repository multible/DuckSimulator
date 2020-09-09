
public class StockEnte extends Ente {
	
	StockEnte( Quakverhalten qv, Flugverhalten fv){
		super(qv,fv);
	}
	
	@Override
	public String anzeigen() {
		System.out.println("I'm a stick duck!");
		String anzeigen = "res\\stockente.png";
		return anzeigen;
	}
}
