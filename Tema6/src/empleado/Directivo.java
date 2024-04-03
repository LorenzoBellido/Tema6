package empleado;

public class Directivo extends Empleado{
	
	

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res ="";
		res = super.toString();
		res += " -> Directivo";
		return res;
	}
}
