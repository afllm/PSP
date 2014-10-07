/*Alejandro Llamas
 * 
 * 6.	Realizar un programa que muestre por pantalla los numero naturales
 *  hasta un valor final introducido por teclado por el usuario, este mismo 
 *  ejemplo lo usaremos para ver la estructura do-while, y for
 * */

package ejercicio1;

import java.util.Scanner;

public class NumerosNaturales {
	
	int numero;
	
	public void pedirNumero(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero positivo");
		this.numero=sc.nextInt();
		sc.close();
	}
	
	
/*Con while;*/
//	public void imprimirNumeros(){
//		int numNat=0;
//		while(numNat<=this.numero){
//			System.out.print(numNat+"\t");
//			numNat++;
//		}
//	}
	
/*Con do while:	*/
//	public void imprimirNumeros(){
//		int numNat=0;
//		do{
//			System.out.print(numNat+"\t");
//			numNat++;
//		}while(numNat<=this.numero);
//	}
	
	
	/*Con for:*/
	public void imprimirNumeros(){
		
		for(int i=0;i<=this.numero;i++){
			System.out.print(i+"\t");
			
		}
	}

	public static void main(String[] args) {
		NumerosNaturales nn=new NumerosNaturales();
		nn.pedirNumero();
		nn.imprimirNumeros();
		
	}

}
