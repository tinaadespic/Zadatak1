package MojPaket;

public class Krug implements Figura {
	private double poluprecnik;

	@Override
	public String toString() {
		return "Krug [poluprecnik=" + poluprecnik + "]";
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	@Override
	public double getO() {
		
		return poluprecnik*3.14;
	}

	@Override
	public double getP() {
		
		return poluprecnik*poluprecnik*3.14;
	}

}
