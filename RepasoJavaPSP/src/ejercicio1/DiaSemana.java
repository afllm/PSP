/*Alejandro Llamas
 * 
 * 5.	Realizar un programa que dado un día de la semana 
 * (entre 1 y 7) muestre por pantalla el nombre del día
 * */

package ejercicio1;

import java.util.Scanner;

public class DiaSemana {
	
	int numero;
	
	public void pedirNumero(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introducir el numero entero");
		this.numero=sc.nextInt();
		sc.close();
	}
	
	public void imprimirDia(){
		switch(numero){
			
		case 1:
			System.out.println("El dia es lunes");
			break;
		case 2:
			System.out.println("El dia es martes");
			break;
		case 3:
			System.out.println("El dia es miercoles");
			break;
		case 4:
			System.out.println("El dia es jueves");
			break;
		case 5:
			System.out.println("El dia es viernes");
			break;
		case 6:
			System.out.println("El dia es sabado");
			break;
		case 7:
			System.out.println("El dia es domingo");
			break;
			
		}
	}

	public static void main(String[] args) {
		DiaSemana ds=new DiaSemana();
		ds.pedirNumero();
		ds.imprimirDia();
		

	}

}
