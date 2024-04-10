package abstractos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		int opc = 0;
		
		double lado1;
		double lado2;
		double lado3;

	
		while(opc != 4) {
			menu();
			opc = sc.nextInt();	
			switch(opc) {
			case 1 ->{
				System.out.println("Introduzca los lados: ");
				lado1 = sc.nextDouble();
				lado2 = sc.nextDouble();
				Poligono rec = new Rectangulo(2,lado1,lado2);
				anyadirPoligono(rec);
			}
			case 2 ->{
				System.out.println("Introduzca los lados: ");
				lado1 = sc.nextDouble();
				lado2 = sc.nextDouble();
				lado3 = sc.nextDouble();
				Poligono tri = new Triangulo(3, lado1, lado2, lado3);
				anyadirPoligono(tri);
			}
			case 3 ->{
				for(Poligono polig : pol) {
					System.out.println(polig);
				}
			}
			case 4 ->{
				System.out.println("Saliendo...");
			}
			default ->{
				System.out.println("Valor no comprendido");
			}
			}
		}
		
		
		
		
	}
	/**
	 * Metodo para imprimir el menu
	 */
	static void menu(){
		System.out.println("Elige una de las siguientes opciones:");
		System.out.println("1. Introducir un rectangulo");
		System.out.println("2. Introducir un triangulo");
		System.out.println("3. Listar el contenido del array");
		System.out.println("4. Salir");
	}

	public static Poligono[] pol = new Poligono[10];

    public static int posicionLibre() {
        int pos = -1;
        int i = 0;

        while(i < pol.length && pos == -1) {
            if(pol[i]==null) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static void listado() {
        for(Poligono electro : pol) {
            if(electro != null) {
                System.out.println(electro);
            }
        }
    }

    public static boolean anyadirPoligono(Poligono poligon) {
        boolean anyadido = false;
        int posLibre = posicionLibre();
            if(posLibre != -1) {
                pol[posLibre] = poligon;
                anyadido = true;
            }

        return anyadido;
    }
}