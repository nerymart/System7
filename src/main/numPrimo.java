package main;

import java.util.Scanner;

public class numPrimo {
	Scanner ent= new Scanner (System.in);
	
	public void menu3() {
		
		numPrimo ds= new numPrimo();
		boolean salir= false;
			int opt ;
		System.out.println("*****************************************************************************************");
		System.out.println("1 :Calcular numero primo");
		System.out.println("2 :Salir");
		opt = ent.nextInt();		
		while (!salir ) {
			
			switch(opt) {
			case 1 :
				ds.numPrimos();
				break;
			case 2:
				salir = true;
				break;
			
			}
		}
		
		
	}
	public void numPrimos(){
		System.out.println("Ingrese un numero");
		int num= ent.nextInt();
		
		for (int i=1; i<num;i++) {
			int count =0;
			for (int j=1; j<=i;j++) {
				if(i%j ==0) 
					count ++;
				
			}
			if (count ==2)
				System.out.println( i);
			
				
		}
		
		
		
	}
	
	
	
	
	
	
}
