/*Alejandro Llamas
 * 
 * 1.	Crear un programa que pida nuestro nombre por teclado y 
 * nos muestre el tipico mensaje “hola mundo: nombre de la persona”
 * 
 * */

package ejercicio1;

import java.util.Scanner;

public class Nombre {
	
	private Scanner scn;
	String nombre;
	
	public void preguntarNombre(){
		scn=new Scanner(System.in);
		System.out.println("Por favor, introduzca su nombre:");
		System.out.println();
		this.nombre=scn.next();
		scn.close();
	}
	
	public void imprimirNombre(){
		System.out.println();
		System.out.println("Hola mundo!: Tu nombre es "+this.nombre);
	}
	
	

	public static void main(String[] args) {
		Nombre n=new Nombre();
		n.preguntarNombre();
		n.imprimirNombre();

	}

}
