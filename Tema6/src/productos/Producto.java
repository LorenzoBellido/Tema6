package productos;

public class Producto {

	protected String nombre = "";
	
	protected double precio;

	public Producto() {
	}

	public Producto(String nombre, double precio) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio >= 0) {
			this.precio = precio;
		}
	}
	
	public double calcular(int cantidad) {
		double precio;
		
		precio = this.precio * cantidad;
		
		return precio;
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res+= this.nombre + ": " + this.precio + "€";
		
		return res;
	}

}
