package abstractos;

public class Triangulo extends Poligono{

	private double lado1;
	
	private double lado2;
	
	private double lado3;
	
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}



	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		if(lado1 > 0){
			this.lado1 = lado1;
		}
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
		if(lado3 > 0) {
			this.lado3 = lado3;
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
	
	

	public double getLado3() {
		return lado3;
	}



	public void setLado3(double lado3) {
		if(lado3 > 0) {
			this.lado3 = lado3;
		}
	}



	@Override
	double area() {
		double altura = 0;
		double area = 0;
		altura = 0;
		return area;
	}
	
	@Override
	public String toString() {
		String res = super.toString() + "Lado 1: " + this.lado1 + "\n" +
				"Lado 2: " + this.lado2;
		return res;
	}
}
