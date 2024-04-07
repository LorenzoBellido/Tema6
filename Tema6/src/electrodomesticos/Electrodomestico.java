package electrodomesticos;

/**
 * La clase Electrodomestico representa un electrodoméstico genérico.
 */
public class Electrodomestico {
	/**
	 * Enumerado para la energia del electrodomestico
	 */
	enum Energia {
		A, B, C, D, E, F
	}

	/**
	 * Enumerado para el color del electrodomestico
	 */
	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Atributo precioBase Precio base del electrodoméstico (por defecto: 100).
	 */
	protected float precioBase = 100;
	/**
	 * Atributo color Color del electrodoméstico (por defecto: BLANCO).
	 */
	protected Colores color = Colores.BLANCO;
	/**
	 * Atributo eficiencia Clasificación de eficiencia energética (por defecto: F)
	 */
	protected Energia eficiencia = Energia.F;
	/**
	 * Atributo peso Peso del electrodoméstico (por defecto: 5).
	 */
	protected float peso = 5;

	/**
	 * Constructor sin parámetros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase           Precio base del electrodoméstico.
	 * @param color                Color del electrodoméstico
	 * @param eficienciaEnergetica Clasificación de eficiencia energética
	 * @param peso                 Peso del electrodoméstico
	 */
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

	/**
	 * Devuelve el precio base
	 * 
	 * @return Precio base
	 */
	public float getPrecioBase() {
		return precioBase;
	}

	/**
	 * Establece el precio base si es mayor que cero.
	 * 
	 * @param precioBase Precio base
	 */
	public void setPrecioBase(float precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * Devuelve el color
	 * 
	 * @return Color
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * Establece el color si es válido (rojo, blanco, azul, gris o negro)
	 * 
	 * @param color Color
	 */
	public void setColor(String color) {
		comprobarColor(color);
	}

	/**
	 * Devuelve la clasificación de eficiencia energética.
	 * 
	 * @return Eficiencia
	 */
	public Energia getEficienciaEnergetica() {
		return eficiencia;
	}

	/**
	 * Establece la eficiencia energética si es válida (A, B, C, D, E o F).
	 * 
	 * @param eficienciaEnergetica Char introducido por parametro
	 */
	public void setEficienciaEnergetica(char eficienciaEnergetica) {
		comprobarConsumoEnergetico(eficienciaEnergetica);
	}

	/**
	 * Devuelve el peso.
	 * 
	 * @return Peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Establece el peso si es mayor que cero
	 * 
	 * @param peso Peso
	 */
	public void setPeso(float peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Verifica y asigna la eficiencia energética del electrodoméstico. Si la letra
	 * proporcionada es válida (A, B, C, D, E o F), se establece la eficiencia
	 * correspondiente. De lo contrario, se asigna la eficiencia por defecto (F).
	 * 
	 * @param letra La letra que representa la eficiencia energética.
	 */
	private void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			this.eficiencia = Energia.valueOf(String.valueOf(Character.toUpperCase(letra)));
		} else {
			this.eficiencia = Energia.F;
		}
	}

	/**
	 * Verifica y asigna el color del electrodoméstico. Si el color proporcionado es
	 * válido (ROJO, BLANCO, AZUL, GRIS o NEGRO), se establece el color
	 * correspondiente. De lo contrario, se asigna el color por defecto (BLANCO).
	 * 
	 * @param color El color del electrodoméstico (en minúsculas o mayúsculas).
	 */
	private void comprobarColor(String color) {

		String colorUpper = color.toUpperCase();

		switch (colorUpper) {
		case "ROJO" -> {
			this.color = Colores.valueOf(colorUpper);
		}
		case "BLANCO" -> {
			this.color = Colores.valueOf(colorUpper);
		}
		case "AZUL" -> {
			this.color = Colores.valueOf(colorUpper);
		}
		case "GRIS" -> {
			this.color = Colores.valueOf(colorUpper);
		}
		case "NEGRO" -> {
			this.color = Colores.valueOf(colorUpper);
		}
		default -> {
			this.color = Colores.BLANCO;
		}

		}
	}

	/**
	 * Calcula el precio final del electrodoméstico (puede ser sobrescrito por
	 * subclases).
	 */
	public void precioFinal() {
		switch (this.eficiencia) {
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

	/**
	 * Devuelve una cadena del electrodomestico.
	 * 
	 * @return res Cadena a mostrar
	 */
	@Override
	public String toString() {
		String res = "Precio base: " + this.precioBase + "\n" + "Color: " + this.color + "\n" + "Consumo Energético "
				+ this.eficiencia + "\n" + "Peso: " + this.peso;
		return res;
	}
}