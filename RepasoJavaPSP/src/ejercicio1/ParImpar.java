/*Alejandro Llamas
 * 
 * 4.	Realizar el ejercicio que vimos en organigramas, donde hacíamos un programa 
 * que  dado un número nos decía si era par o impar
 * */

package ejercicio1;

import java.util.Scanner;

public class ParImpar {
	
	int numero;
	
	public void pedirNumero(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introducir un numero entero: ");
		this.numero=sc.nextInt();
		sc.close();
	}
	
	public void calcular(){
		if((this.numero%2)==0){
			System.out.println("El numero "+this.numero+" es par");
		}else{
			System.out.println("El numero "+this.numero+" es impar");
		}
	}
	
	

	public static void main(String[] args) {
		ParImpar pi=new ParImpar();
		pi.pedirNumero();
		pi.calcular();

	}

}
