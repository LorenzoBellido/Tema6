package electrodomesticos;

/**
 * La clase Television representa un electrodoméstico de tipo televisión.
 * Hereda de la clase base Electrodomestico.
*/
public class Television extends Electrodomestico {
	/**
	 * Atributo resolucion Tamaño de la pantalla en pulgadas (por defecto: 20).
	 */
	private float resolucion = 20;
	/**
	 * Atributo sintonizador Indica si la televisión tiene sintonizador (por defecto: falso).
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor vacío que inicializa las propiedades con valores predeterminados.
	 */
	public Television() {

	}

	/**
	 *Constructor con parámetros .
	 * @param precioBase Precio inicial
	 * @param color Color del electrodomestico
	 * @param eficienciaEnergetica Consumo del electrodomestico
	 * @param peso Peso del electrodomestico
	 * @param resolucion Resolucion del electrodomestico
	 * @param sintonizador Sintonizador del electrodomestico
	 */
	public Television(float precioBase, String color, char eficienciaEnergetica, float peso, float resolucion,
			boolean sintonizador) {
		super(precioBase, color, eficienciaEnergetica, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizador = sintonizador;
	}

	/**
	 * Constructor con parámetros para precio base y peso.
	 * @param precioBase Precio inicial
	 * @param peso Peso del electrodomestico
	 */
	public Television(float precioBase, float peso) {
		setPrecioBase(precioBase);
		setPeso(peso);
	}

	/**
	 * Devuelve el tamaño de la pantalla.
	 * @return Tamaño de la pantalla.
	 */
	public float getResolucion() {
		return resolucion;
	}

	/**
	 * Indica si la televisión tiene Indica si la televisión tiene sintonizador..
	 * @return Sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}
	
	/**
	 * Calcula el precio final de la televisión considerando la resolución y el sintonizador.
	 */
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
	
	/**
	 * Devuelve una cadena de la televisión, incluyendo sus propiedades heredadas.
	 * @return res Cadena a mostrar
	 */
	@Override
	public String toString() {
		String res = super.toString() + "\n" + "Resolucion: " + this.resolucion
				+ "\n" + "Sintonizador: " + this.sintonizador;
		return res;
	}
}