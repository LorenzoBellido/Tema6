package empleado;

public class Main {

	public static void main(String[] args) {
		Empleado e = new Empleado("Edu");
		System.out.println(e);
		Operario op = new Operario("Marco");
		System.out.println(op);
		Directivo d = new Directivo("Lorenzo");
		System.out.println(d);
		Oficial of = new Oficial("Hector");
		System.out.println(of);
		Tecnico t = new Tecnico("PesoPluma");
		System.out.println(t);

	}

}
