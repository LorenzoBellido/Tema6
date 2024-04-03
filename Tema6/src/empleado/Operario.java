package empleado;

public class Operario extends Empleado {
	
	
	
	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res ="";
		res = super.toString();
		res += " -> Operario";
		return res;
	}

}
