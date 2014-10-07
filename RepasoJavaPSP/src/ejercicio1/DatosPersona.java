/*Alejandro Llamas
 * 
 * 2.	En el siguiente programa le pediremos al usuario que ingrese su nombre, 
 * edad y altura junto al mensaje de Hola mundo…
 * */

package ejercicio1;

import java.util.Scanner;

public class DatosPersona {
	
	private Scanner scn;
	String nombre;
	int edad;
	float altura;
	
	public void preguntarDatos(){
		scn=new Scanner(System.in);
		System.out.println("Por favor, introduzca su nombre:");
		System.out.println();
		this.nombre=scn.next();
		System.out.println("Por favor, introduzca su edad:");
		System.out.println();
		this.edad=scn.nextInt();
		System.out.println("Por favor, introduzca su altura:");
		System.out.println();
		this.altura=scn.nextFloat();
		scn.close();
	}
	
	public void imprimirDatos(){
		System.out.println();
		System.out.println("Hola mundo! Estos son tus datos:");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+this.edad);
		System.out.println("Altura: "+this.altura);
	}
	
	

	public static void main(String[] args) {
		DatosPersona n=new DatosPersona();
		n.preguntarDatos();
		n.imprimirDatos();

	}

}
