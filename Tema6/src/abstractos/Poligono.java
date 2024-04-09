package abstractos;

public abstract class Poligono {

	protected int numeroLados;
	
	
	
	public Poligono(int numeroLados) {
		if(numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	abstract double area();
	
	@Override
	public String toString() {
		String res = "Numero lados: " + this.numeroLados;
		return res;
	}
}
