package main;

import java.util.Scanner;

public class menu2OP {
	Scanner df= new Scanner (System.in);
	MRU inst= new MRU();
	trayecProyectil ad= new trayecProyectil();
	numPrimo xd =new numPrimo();
     fact jk= new fact();
     numAleat men5 = new numAleat();
     nDecimalBinario mm = new nDecimalBinario();

	public void pricipal() {
		boolean salir = false ;
		int op;
		while (!salir) {
			System.out.print("1 :    Calcular de MRU");
			System.out.print("\n2 :  Calcular la altura máxima de un proyectil con trayectoria parabólica");
			System.out.print("\n3 :  Identificar si un número es primo");
			System.out.print("\n4 :  Calcular el factorial de un número");
			System.out.print("\n5 :  Programa que genera número aleatorio y sumar 2 números ");
			System.out.print("\n6 :  Programa que permite convertir un número decimal  a un número binario");
			
			op= df.nextInt();
			
			switch(op) {
			case 1:
				inst.menu();
				break;
			case 2:
				ad.menu2();
				break;
				
			case 3:
			xd.menu3();
				break;
			case 4:
				jk.menu4();
				
				break;
			case 5 :
				men5.menu5();
				break;
			case 6 :
				mm.menu6();
				break;
				
			}
			
			
		}
	}

}
