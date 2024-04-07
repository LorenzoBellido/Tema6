package electrodomesticos;

/**
 * La clase Lavadora representa un electrodoméstico de tipo lavadora.
 * Hereda de la clase base Electrodomestico.
*/
public class Lavadora extends Electrodomestico {
	/**
	 * Atributo carga Carga de la lavadora
	 */
	private float carga = 5;

	/**
	 * Constructor sin parametros
	 */
	public Lavadora() {

	}

	/**
	 *Constructor con parámetros .
	 * @param precioBase Precio inicial
	 * @param color Color del electrodomestico
	 * @param eficienciaEnergetica Consumo del electrodomestico
	 * @param peso Peso del electrodomestico
	 * @param carga Carga de la lavadora
	 */
	public Lavadora(float precioBase, String color, char eficienciaEnergetica, float peso, float carga) {
		super(precioBase, color, eficienciaEnergetica, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Constructor con parámetros para precio base y peso.
	 * @param precioBase Precio inicial
	 * @param peso Peso del electrodomestico
	 */
	public Lavadora(float precioBase, float peso) {
		setPrecioBase(precioBase);
		setPeso(peso);
	}

	/**
	 * Devuelve la carga de la pantalla.
	 * @return Carga de la pantalla.
	 */
	public float getCarga() {
		return carga;
	}

	/**
	 * Calcula el precio final de la televisión considerando la resolución y el sintonizador.
	 */
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase += 50;
		}
	}
	
	/**
	 * Devuelve una cadena de la lavadora, incluyendo sus propiedades heredadas.
	 * @return res Cadena a mostrar
	 */
	@Override
	public String toString() {
		String res = super.toString() + "\n" + "Carga: " + this.carga;
		return res;
	}

}