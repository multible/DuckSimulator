
public class NichtFliegen implements Flugverhalten {

	@Override
	public String fliegen() {
		System.out.println("NichtFliegen");
		String fliegen = "NichtFliegen";
		return fliegen;
	}

}
