package abstractos;

public class Triangulo extends Poligono {
	/**
	 * Atributo del 1º lado del triangulo
	 */
	private double lado1;
	/**
	 * Atributo del 2º lado del triangulo
	 */
	private double lado2;
	/**
	 * Atributo del 3º lado del triangulo
	 */
	private double lado3;
	
	/**
	 * Contructor del Triangulo con los parametros de entrada vacio (solo los heredados)
	 * 
	 * @param numeroLados Es el numero de lados
	 */
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}
	/**
	 * El Constructor del traiangulo con los parametros heredados del padre
	 * (Poligono) y con los atributos de lo lados que se necesitan
	 * 
	 * @param numeroLados Atributo heredado de Poligono que consta con la cantidad
	 *                    de lados
	 * @param lado1       Atributo del 1º lado
	 * @param lado2       Atributo del 2º lado
	 * @param lado3       Atributo del 3º lado
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}

	}
	/**
	 * Get para optener el lado1
	 * @return envia el lado1
	 */
	public double getLado1() {
		return lado1;
	}
	/**
	 * Set para modificar el lado1(tiene que cumplir la condicion)
	 * @param lado1 
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}
	/**
	 * Get para optener el lado2
	 * @return envia el lado2
	 */
	public double getLado2() {
		return lado2;
	}
	/**
	 * Set para modificar el lado2(tiene que cumplir la condicion)
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	/**
	 * Get para optener el lado3
	 * @return envia el lado3
	 */
	public double getLado3() {
		return lado3;
	}
	/**
	 * Set para modificar el lado3(tiene que cumplir la condicion)
	 * @param lado3
	 */
	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	/**
	 * El metodo area para calcular el area de un trinagulo
	 * utilizando  la formula de Heron
	 * 
	 * @return area Envia el resultado del area calculada
	 */
	@Override
	double area() {
		double area = 0;
		double sp = 0;

		sp = (lado1 + lado2 + lado3) / 2;

		area = (Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)));
		
		return area;
	}
	/**
	 * Imprime el obejto mostrando la cantidad de lados y su valor
	 * 
	 * @return cad Envia la cadena con todo los lados y su area
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		
		cad += "El lado 1 es: " + lado1 + "\n";
		cad += "El lado 2 es: " + lado2 + "\n";
		cad += "El lado 3 es: " + lado3 + "\n";
		cad += "El area es: " + area();

		return cad;
	}
}