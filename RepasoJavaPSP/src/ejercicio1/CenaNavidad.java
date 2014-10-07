/*Alejandro Llamas
 * 
 * 3.	Realizar un programa que nos muestre un mensaje para saber si una persona 
 * podrá venir a la discoteca el día que hagamos la cena de navidad o se quedará en 
 * la puerta…(teniendo en cuenta que para entrar en algunas discotecas hacen falta 21 años)
 * */

package ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CenaNavidad {
	Date fechaNacimiento=null;
	Date fechaCena=null;
	String fechaNac,fechaCen;
	
	int edad,mes,dia;
	
	
	
	public void fechas(){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Introducir la fecha de nacimiento del invitado (dd-mm-aaaa):");
		fechaNac=scn.next();
		System.out.println("Introducir la fecha de la cena (dd-mm-aaaa):");
		fechaCen=scn.next();
		scn.close();
	}
	
	
	public void edad(){
		try {
			fechaNacimiento=new SimpleDateFormat("dd-MM-yyyy").parse(this.fechaNac);
		} catch (ParseException e1) {
			System.out.println("Hay un error en la fecha de nacimiento: "+e1);
			e1.printStackTrace();
		}
		try {
			fechaCena=new SimpleDateFormat("dd-MM-yyyy").parse(this.fechaCen);
		} catch (ParseException e) {
			System.out.println("Hay un error en la fecha de la cena: "+e);
			e.printStackTrace();
		}
		
		Calendar nacimiento=Calendar.getInstance();
		Calendar cena=Calendar.getInstance();
		
		nacimiento.setTime(this.fechaNacimiento);
		cena.setTime(this.fechaCena);
		
		//Se calcula la edad en el día de la cena:
		this.edad=cena.get(Calendar.YEAR)-nacimiento.get(Calendar.YEAR);
		this.mes=cena.get(Calendar.MONTH)-nacimiento.get(Calendar.MONTH);
		this.dia=cena.get(Calendar.DATE)-nacimiento.get(Calendar.DATE);
		if(mes<0 || (mes==0 && dia<0)){
			edad--;
		}
		
		
	}
	
	//Este metodo devuelve si podrá o no ir a la discoteca:
	public void mensaje(){
		if(this.edad>=21){
			System.out.println("El invitado podrá ir a la discoteca, ya que tendrá "+edad+" años.");
		}else{
			System.out.println("El invitado no podrá ir a la discoteca, ya que tendrá "+edad+" años.");
		}
	}
	

	public static void main(String[] args) {
		CenaNavidad cn= new CenaNavidad();
		cn.fechas();
		cn.edad();
		cn.mensaje();

	}

}
