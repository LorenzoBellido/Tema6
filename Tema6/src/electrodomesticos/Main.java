package electrodomesticos;

public class Main {

	public static void main(String[] args) {
		// Variables para guardar las sumas totales de cada electrodomestico
		double sumaE = 0;
		double sumaL = 0;
		double sumaT = 0;
		
		// Creación de los electrodomesticos
		Electrodomestico e1 = new Electrodomestico(150, "negro", 'A', 2);
		Electrodomestico e2 = new Television(100, 15);
		Electrodomestico e3 = new Television(200, "AZUL", 'B', 20, 24, false);
		Electrodomestico e4 = new Lavadora(230, 67);
		Electrodomestico e5 = new Lavadora(175, "", ' ', 5, 12);
		Electrodomestico e6 = new Electrodomestico();
		Electrodomestico e7 = new Television();
		Electrodomestico e8 = new Lavadora();
		Electrodomestico e9 = new Television(200, " ", ' ', 34, 50, true);
		Electrodomestico e10 = new Electrodomestico(150, "Verde", 'Z', 2);
		
		// Guardo los electrodomesticos en un array
		Electrodomestico elec[] = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
		
		// Imprimo los elementos del array
		for(Electrodomestico obj : elec) {
			System.out.println(obj);
			System.out.println("------------------- \n");
		}
		// Imprimo el precio final de cada elemento
		System.out.println("------Precio Final------");
		for(int i = 0; i < elec.length; i++) {
			System.out.println("Electrodomestico + " + (i + 1));
			elec[i].precioFinal();
			System.out.println(elec[i].precioBase);
		}
		// Calculo la suma de los electrodomésticos según su tipo
		for(int i = 0; i < elec.length; i++) {
			
			if(elec[i] instanceof Electrodomestico) {
				sumaE += elec[i].precioBase;
			}
			if(elec[i] instanceof Lavadora) {
				sumaL += elec[i].precioBase;
			}
			if(elec[i] instanceof Television) {
				sumaT += elec[i].precioBase;
			}
		}
		// Muestro la suma de cada tipo
		System.out.println("------Total------");
		System.out.println("Suma de los Electrodomesticos: " + sumaE);
		System.out.println("Suma de los Lavadoras: " + sumaL);
		System.out.println("Suma de los Televisiones: " + sumaT);
	}

}
