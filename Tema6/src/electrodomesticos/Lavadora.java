package electrodomesticos;

public class Lavadora extends Electrodomestico {
	private float carga = 5;

	public Lavadora() {

	}

	public Lavadora(float precioBase, String color, char eficienciaEnergetica, float peso, float carga) {
		super(precioBase, color, eficienciaEnergetica, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	public Lavadora(float precioBase, float peso) {
		setPrecioBase(precioBase);
		setPeso(peso);
	}

	public float getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase += 50;
		}
	}

}