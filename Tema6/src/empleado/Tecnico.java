package empleado;

public class Tecnico extends Operario{
	
	
	
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res ="";
		res = super.toString();
		res += "-> Técnico";
		return res;
	}
}
