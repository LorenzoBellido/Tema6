package electrodomesticos;

public class Television extends Electrodomestico {
	private float resolucion = 20;
	private boolean sintonizador = false;

	public Television() {

	}

	public Television(float precioBase, String color, char eficienciaEnergetica, float peso, float resolucion,
			boolean sintonizador) {
		super(precioBase, color, eficienciaEnergetica, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizador = sintonizador;
	}

	public Television(float precioBase, float peso) {
		setPrecioBase(precioBase);
		setPeso(peso);
	}

	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.resolucion > 40) {
			this.precioBase *= 1.3;
		}
		if (this.sintonizador) {
			this.precioBase += 50;
		}
	}
}