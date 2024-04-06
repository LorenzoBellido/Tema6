package electrodomesticos;

public class Electrodomestico {
	enum Energia {
		A, B, C, D, E, F
	}

	enum Colores {
		blanco, negro, rojo, azul, gris
	}

	protected float precioBase;
	protected Colores color = Colores.blanco;
	protected Energia eficienciaEnergetica = Energia.F;
	protected float peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(float precioBase, String color, char eficienciaEnergetica, float peso) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		comprobarConsumoEnergetico(eficienciaEnergetica);
		comprobarColor(color);
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(String color) {
		comprobarColor(color);
	}

	public Energia getEficienciaEnergetica() {
		return eficienciaEnergetica;
	}

	public void setEficienciaEnergetica(char eficienciaEnergetica) {
		comprobarConsumoEnergetico(eficienciaEnergetica);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	private void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			this.eficienciaEnergetica = Energia.valueOf(String.valueOf(letra));
		} else {
			this.eficienciaEnergetica = Energia.F;
		}
	}

	private void comprobarColor(String color) {
		if (color.equals("rojo") || color.equals("blanco") || color.equals("azul") || color.equals("gris")
				|| color.equals("negro")) {
			this.color = Colores.valueOf(color);
		} else {
			this.color = Colores.blanco;
		}
	}

	public void precioFinal() {
		switch (this.eficienciaEnergetica) {
		case A:
			this.precioBase += 100;
			break;
		case B:
			this.precioBase += 80;
			break;
		case C:
			this.precioBase += 60;
			break;
		case D:
			this.precioBase += 50;
			break;
		case E:
			this.precioBase += 30;
			break;
		case F:
			this.precioBase += 10;
			break;
		default:
			break;
		}

		if (this.peso < 20) {
			this.precioBase += 10;
		} else if (this.peso < 50) {
			this.precioBase += 50;
		} else if (this.peso < 80) {
			this.precioBase += 80;
		} else {
			this.precioBase += 100;
		}
	}
}