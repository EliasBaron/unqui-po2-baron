package ar.edu.unq.po2.tp3;
import java.util.Scanner;

public class desarmadorNum {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Por favor ingrese el tamaño del array: ");
		int n = teclado.nextInt();
		int array [] = new int [n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingrese date " + (i + 1) + ": ");
			array [i] = teclado.nextInt();
 		}
		
		int mayorCantPares = array [0]; //numeros.get(0)  [11, 22, 33]
		
		for (int i = 1; i < array.length; i++) {
			if (Counter.contarPares(Desarmador.desarmar(array [i])) > Counter.contarPares(Desarmador.desarmar(mayorCantPares))) {
				mayorCantPares = array [i];
			}
		}
		
		System.out.println("El numero con mayor cantidad de pares es: " + mayorCantPares);
	}
	
}