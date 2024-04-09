package abstractos;

public class Rectangulo extends Poligono {

	private double lado1;
	
	private double lado2;
	
	
	
	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}



	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		if(lado1 > 0){
			this.lado1 = lado1;
		}
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
	}



	public double getLado1() {
		return lado1;
	}



	public void setLado1(double lado1) {
		if(lado1 > 0){
			this.lado1 = lado1;
		}
	}



	public double getLado2() {
		return lado2;
	}



	public void setLado2(double lado2) {
		if(lado2 > 0){
			this.lado2 = lado2;
		}
	}

	@Override
	double area() {
		double area = 0;
		area = lado1 * lado2;
		return area;
	}
	
	@Override
	public String toString() {
		String res = super.toString() + "Lado 1: " + this.lado1 + "\n" +
				"Lado 2: " + this.lado2 + "\n" + 
				"Área: " + area();
		return res;
	}
}
