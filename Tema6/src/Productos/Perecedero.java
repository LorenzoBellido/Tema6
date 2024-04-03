package Productos;

public class Perecedero extends Producto {

	private int caducidad;


	public Perecedero(String nombre, double precio, int caducidad) {
		super(nombre, precio);
		if(caducidad > 0) {
			this.caducidad = caducidad;
		}
	}


	public int getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(int caducidad) {
		if(caducidad > 0) {
			this.caducidad = caducidad;
		}
	}

	public double calcular(int cantidad) {
		double precio;
		
		if(this.caducidad == 3) {
			precio = super.calcular(cantidad)/2;
		}else if(this.caducidad == 2) {
			precio = super.calcular(cantidad)/3;
		}else if(this.caducidad == 1) {
			precio = super.calcular(cantidad)/4;
		}else {
			precio = super.calcular(cantidad);
		}
		
		return precio;
	}

	@Override
	public String toString() {
		String res =  "";
		
		res += super.toString() + " " + caducidad + " días";
		
		return res;
	}
	
}
