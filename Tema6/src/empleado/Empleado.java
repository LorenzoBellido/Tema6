package empleado;

public class Empleado {

	private String nombre = "";
	
	public Empleado() {
	}



	public Empleado(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
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
	
	@Override
	public String toString() {
		String res ="";
		res += "Empleado " +  this.nombre;
		return res;
	}
	
}
