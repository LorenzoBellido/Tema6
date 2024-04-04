package electrodomesticos;

public class Electrodomestico {

	protected enum Color{
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	protected enum Conmsumo {
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
		if(precioBase > 0) {
			this.precioBase = precioBase;
		}
		if(peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, double peso, String color, char consumo) {
		if(precioBase > 0) {
			this.precioBase = precioBase;
		}
		if(peso > 0) {
			this.peso = peso;
		}
		if(color.equals(Color.valueOf(color))) {
			this.color = color;
		}
		if(consumo == Consumo.valueOf(consumo)) {
			this.consumo = consumo;
		}
	}
	
	
	
}
