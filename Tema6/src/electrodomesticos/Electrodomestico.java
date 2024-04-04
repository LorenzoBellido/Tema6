package electrodomesticos;

public class Electrodomestico {

	protected enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	protected enum Consumo {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;

	protected double peso = 5;

	protected String color = "BLANCO";

	protected char consumo = 'F';

	public Electrodomestico() {
		super();
	}

	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, double peso, String color, char consumo) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		if (color.equals(Color.valueOf(color))) {
			this.color = color;
		}
		if (consumo == (Consumo.valueOf(consumo))) {
			this.consumo = consumo;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		boolean comprobar = false;

		if (consumo == (Consumo.valueOf(consumo))) {
			comprobar = true;
		} else {
			this.consumo = 'F';
		}

		return comprobar;
	}

	private boolean comprobarColor(String color) {
		boolean comprobar = false;

		if (color.equals(Color.valueOf(color))) {
			comprobar = true;
		} else {
			this.color = "BLANCO";
		}

		return comprobar;
	}

	protected void precioFinal() {
		char consumo = this.consumo;
		double peso = this.peso;

		switch (consumo) {
		case 'A' -> {
			this.precioBase += 100;
		}
		case 'B' -> {
			this.precioBase += 80;
		}
		case 'C' -> {
			this.precioBase += 60;
		}
		case 'D' -> {
			this.precioBase += 40;
		}
		case 'E' -> {
			this.precioBase += 20;
		}
		case 'F' -> {
			this.precioBase += 10;
		}
		}
		
		if(peso >= 0 && peso <= 19) {
			this.precioBase += 10;
		}else if(peso >= 20 && peso <= 49) {
			this.precioBase += 50;
		}else if(peso >= 50 && peso <= 79) {
			this.precioBase += 80;
		}else if(peso >= 80) {
			this.precioBase += 100;
		}
	}
}
