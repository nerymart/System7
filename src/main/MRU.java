package main;

import java.util.ArrayList;
import java.util.Scanner;

import data.data;

public class MRU {
	ArrayList<data> mr = new ArrayList<data>();
	Scanner sc = new Scanner (System.in);
public void menu(){
	
	boolean salir = false ;
	int op;
	while (!salir) {
		System.out.print("1 : Calcular el tiempo");
		System.out.print("2 : Calcular velocidad");
		System.out.print("3 : calcular tiempo");
		System.out.print("4 : Salir");
		op= sc.nextInt();
		
		switch(op) {
		case 1:
			break;
		case 2:
			break;
	
		case 3:
			break;
		case 4:
			break;
			
		}
		
		
	}
}

	
	public void tiempo(){
		System.out.println("Dijite la distancia");
		
		System.out.println("Dijite la velocidad");
		System.out.println("");
		
		
		
	}
	public void  velocidad(){
		
	}
	public void  distancia (){
		
	}
	

}
