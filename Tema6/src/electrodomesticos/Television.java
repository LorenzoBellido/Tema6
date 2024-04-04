package electrodomesticos;

public class Television extends Electrodomestico {

	private double resolucion = 20;

	private boolean sintonizador = false;

	public Television() {
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(double resolucion, boolean sintonizador) {
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public Television(double precioBase, double peso, String color, char consumo, double resolucion,
			boolean sintonizador) {
		super(precioBase, peso, color, consumo);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizador = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	@Override
	protected void precioFinal() {
		double aumento = this.precioBase * 0.30;
		if(this.resolucion < 40) {
			this.precioBase = this.precioBase + aumento;
			super.precioFinal();
		}else {
			super.precioFinal();
		}
		if(this.sintonizador) {
			this.precioBase += 50;
			super.precioFinal();
		}else {
			super.precioFinal();
		}
	}

}
