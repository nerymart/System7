package main;

import java.util.Scanner;

public class numAleat {
	Scanner pro = new Scanner (System.in);
	
	public void menu5() {
		numAleat ms = new numAleat();
		boolean sal = false ;
		int ini;
		while (!sal) {
			System.out.println("******************************************************************************");
			
			System.out.println("1 : Numero aleatorio");
			System.out.println("2 : Sumar dos numeros");
			System.out.println("3 : Salir");
			ini= pro.nextInt();
			switch (ini) {
			case 1 :
				ms.aleatorio();
				break;
			case 2 :
				ms.suma();
				break;
			case 3 :
				sal= true;
				break;
			}
			
			
		}
	}
	
	public void aleatorio () {
		System.out.println(" Dijite un numero");
		int numA = pro.nextInt();
		
		int ale =0;
		ale = (int)(Math.random() *numA +1);
		System.out.println("Numero aleatorio segun el rango dado : " +ale);
		
		
		
	}
	public void suma() {
		System.out.println("                                         Dijite dos numeros a sumar");
		System.out.println();
		System.out.println("Primer numero");
		int num1= pro.nextInt();
		System.out.println("Segundo numero");
		int num2 = pro.nextInt();
		int suma;
		
		suma = num1 + num2;
		System.out.println("La suma es : "+suma);
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
