package main;

import java.util.Scanner;

public class trayecProyectil {
	Scanner entrada= new Scanner (System.in);
	
	public void menu2(){
		trayecProyectil sk = new trayecProyectil();
		boolean salir = false;
		int od ;
		while (!salir) {
			System.out.println("1 : calcular la altura máxima de un proyectil con trayectoria parabólica");
			System.out.println("2 : Salir");
			od = entrada.nextInt();
			
			switch(od) {
			case 1 :
				sk.operat();
				break;
			case 2:
				salir = true;
				break;
			
			}
		}
		
		
	}
	
	public void operat() {
		System.out.println("Dijite la velovidad");
		int velcidad= entrada.nextInt();
		System.out.println("angulo");
		int grados = entrada.nextInt();
		
		double result=0;
		/*int gravedad =10;*/
	    double result2;
		double op1=0;
		double floo;
		
		
		double angulosRadian = grados* Math.PI/180;
		result = Math.asin(angulosRadian);
		op1=Math.pow(velcidad, 2);
	
		 result2 =  (op1*Math.pow(result, 2))/20;
		 floo= Math.floor(result2);
		 
		 System.out.println("resultado "+floo+" m");
		
		
		
		
	}

}








