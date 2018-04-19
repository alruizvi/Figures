package figures;

public class Circulo {
	private int radi = 0;

	public Circulo(int radi) {
		super();
		this.radi = radi;
	}

	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) {
		this.radi = radi;
	}
	
	public double calculPerimetre() {
		return this.radi*2*Math.PI;
	}
	
	public double calculArea() {
		return Math.pow(this.radi,2)*Math.PI;
	}
}
