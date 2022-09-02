package main;

import java.util.Scanner;

public class nDecimalBinario {
	
	Scanner ent = new Scanner ( System.in );
	
	public void menu6() {
		nDecimalBinario mm = new nDecimalBinario();
		boolean salir = false ;
		int men6 = 0;
		
		while (!salir) {

			System.out.println("********************************************************");
			System.out.println("1 : Calcular binario");
			System.out.println("2 : Salir");
			men6= ent.nextInt();
			
			switch(men6) {
			case 1 :
				mm.operacion();
				
				break;
			case 2 :
				salir = true;
				break;
			}
		}
		
	}
	
	public void operacion() {
		System.out.println(" Dijite un numero");
		int numx  = ent.nextInt();
		int residuo, binario = 0,fi = 0;
		while ( numx!=0) {
			residuo = numx%2;
			binario += residuo * Math.pow(10, fi);
			fi++;
			numx/=2;
			
			
		}
		System.out.println(binario);
		
		
		
		
		
		
		
		
	}

}
