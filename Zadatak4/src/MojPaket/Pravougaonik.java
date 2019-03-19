package MojPaket;

public class Pravougaonik implements Figura {
	private double sirina;
	private double visina;

	public Pravougaonik(double sirina, double visina) {
		super();
		this.sirina = sirina;
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "Pravougaonik [sirina=" + sirina + ", visina=" + visina + "]";
	}

	public double getSirina() {
		return sirina;
	}

	public void setSirina(double sirina) {
		this.sirina = sirina;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}

	@Override
	public double getO() {
		// TODO Auto-generated method stub
		return 2*visina+2*sirina;
	}

	@Override
	public double getP() {
		return sirina*visina;
	}

}
