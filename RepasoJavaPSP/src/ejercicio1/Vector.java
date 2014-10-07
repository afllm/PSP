/*Alejandro Llamas
 * 
 * 7.	Defino un vector de 10 enteros, lo relleno y despu�s me muestra por pantalla los valores de dicho vector
 * */

package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector {
	
	int vector[]=new int[10];
	
	public void rellenarVector(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<this.vector.length;i++){
			
			System.out.println("Introduzca el numero entero para la posici�n "+i+":");
			try{
				this.vector[i]=sc.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("El dato introducido no es correcto, por favor,");
				sc.nextLine();
				i--;
			}
		}
		sc.close();
	}
	
	public void mostrarVector(){
		for(int i=0;i<this.vector.length;i++){
			System.out.println();
			System.out.println("N�mero introducido en la posici�n "+i+": "+this.vector[i]);
		}
	}

	public static void main(String[] args) {
		Vector v=new Vector();
		v.rellenarVector();
		v.mostrarVector();
		
		

	}

}
