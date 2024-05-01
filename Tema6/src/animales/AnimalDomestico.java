package animales;

public abstract class AnimalDomestico implements Animal {
	
	String nombre = "";
	
	String raza = "";
	
	double peso;
	
	String color = "";

	@Override
	public void comer() {
		
		
	}

	@Override
	public void dormir() {
		
		
	}

	@Override
	public abstract void hacerRuido();
	
	public boolean vacunar() {
		boolean vacunado = false;
		
		return vacunado;
	}

	public abstract boolean hacerCaso();
}
