package main;

import java.util.Scanner;

public class fact {
	Scanner rt= new Scanner (System.in);
	
	
	
	 
	public void menu4 () {
		fact xd =new fact();
		boolean salir = false;
		int ot;
		
		while (!salir) {
			System.out.println("1 : Calcular factorial");
			System.out.println("2 : Salir");
			ot = rt.nextInt();
			
			switch (ot) {
			case 1 :
				xd.factorial();
				break;
			case 2 :
				salir= true;
				break;
			}
		}
		
		
			
	
	}
	public void factorial() {
		System.out.println("Dijite un numero");
		int n = rt.nextInt();
	
		int fac=1;
		for (int i =1; i<= n;i++) {
			fac = fac*i;
			System.out.println(fac);
			
		}
		System.out.println("El factorial es : " + fac);
		
	


	}
}
