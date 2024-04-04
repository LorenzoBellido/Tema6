package electrodomesticos;

public class Lavadora extends Electrodomestico{

	private double carga = 5;

	public Lavadora() {
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Lavadora(double precioBase, double peso, String color, char consumo, double carga) {
		super(precioBase, peso, color, consumo);
		if(carga > 0) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}

	@Override
	protected void precioFinal() {
		if(this.carga < 30) {
			this.precioBase += 50;
			super.precioFinal();
		}else {
			super.precioFinal();
		}
	}
	
}
