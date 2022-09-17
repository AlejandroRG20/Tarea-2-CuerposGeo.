package Cuerposgeometricos2;
import  java.util.*;
public class Icosaedro {
	public static void main(String[] args) {
		float a;
		double Area,v;
		int continuar;
		
		Scanner n=new Scanner(System.in);
do {		
	do {	
		System.out.println("Digite A del Icosaedro: ");
		a=n.nextFloat();
		if(a<0) {System.out.println( "Error, No se aceptan datos negativos");}
	}while(a<0);
		
		Area=5*Math.pow(a, 2)*Math.sqrt(3);
		v=5*(3+Math.sqrt(5)*Math.pow(a, 3)/12);
		
		System.out.println("******Datos del icosaedro******");
		System.out.println("El Area es:"+String.format("%.2f",Area));
		System.out.println("El Volumen es:"+String.format("%.2f",v));
		
	do {
		System.out.println("Desea continuar con el programa? 1.Si 2.No");
		continuar=n.nextInt();
		if(continuar<0 ||  continuar>2) {System.out.println("Error, digite un dato valido");}
	    }while(continuar<0 || continuar>2);
   }while(continuar==1);


       System.out.println("Fin del  programa");
n.close();

	}


}
