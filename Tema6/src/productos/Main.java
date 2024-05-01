package productos;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("Agua", 2); 
		Producto p2 = new Producto("Cocacola", 3); 
		Producto p3 = new Producto("Fanta", 1.5); 
		Perecedero pe1 = new Perecedero("Carne", 10, 4);
		Perecedero pe2 = new Perecedero("Pescado", 10, 1);
		NoPerecedero npe1 = new NoPerecedero("Atún", 5, "Pescado");
		NoPerecedero npe2 = new NoPerecedero("Piedra", 2, "Objeto");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pe1);
		System.out.println(pe2);
		System.out.println(npe1);
		System.out.println(npe2);
		
		System.out.println("Precios:");
		System.out.println("Precio por 3 botellas de agua: " + p1.calcular(3));
		System.out.println("Precio por 2 carnes: " + pe1.calcular(2));	
		System.out.println("Precio por 1 pescado: " + pe2.calcular(1));
		System.out.println("Precio por 2 atunes: " + npe1.calcular(2));	
		System.out.println("Precio por 1 piedra: " + npe1.calcular(1));
		
	}

}
