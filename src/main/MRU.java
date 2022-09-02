package main;


import java.util.Scanner;



public class MRU {

	
	Scanner sc = new Scanner (System.in);
public void menu(){
	MRU fg= new MRU();
	
	boolean salir = false ;
	int op;
	while (!salir) {
		System.out.print("*******************************************************************************");
		System.out.print("\n1 : Calcular el tiempo");
		System.out.print("\n2 : Calcular velocidad");
		System.out.print("\n3 : calcular distancia");
		System.out.print("\n4 : Salir");
		op= sc.nextInt();
		
		switch(op) {
		case 1:
			fg.tiempo();
			break;
		case 2:
			fg.velocidad();
			break;
		case 3:
			fg.distancia();
			break;
		case 4:
			salir= true;
			break;
			
		}
		
		
	}
}

	
	public void tiempo(){
		System.out.println("Dijite la distancia");
		int distancia= sc.nextInt();		
		System.out.println("Dijite la velocidad");
		int velocidad = sc.nextInt();
	
		int sd;
		sd= distancia/velocidad;
		System.out.println("El tiempo para este ejercicio es : "+sd+" m");
		
		
	}
	public void  velocidad(){
		System.out.println("Dijite la distancia");
		int distancia= sc.nextInt();		
		System.out.println("Tiempo");
		int tiempo=sc.nextInt();
		int xd;
		
		xd=distancia/tiempo;
		System.out.println("La velocidad para este ejercicio es : "+xd+" m/s");
		
		
	}
	public void  distancia (){		
		System.out.println("Dijite la velocidad");
		int velocidad = sc.nextInt();
		System.out.println("Tiempo");
		int tiempo=sc.nextInt();
		int result=0;
		int fg;
		fg= tiempo/60;
		
		result= velocidad*fg;
		
		System.out.println("La distancia para es :"+fg+" km");
	}
	

}
