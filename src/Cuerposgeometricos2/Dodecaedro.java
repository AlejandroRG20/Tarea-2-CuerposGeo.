package Cuerposgeometricos2;
import java.util.*;
public class Dodecaedro {
	public static void main(String[] args) {
		float aris;
		double A,V;
		int continuar;
		
		Scanner n=new Scanner(System.in);
		
	do {	
		
		
		do {
		System.out.println("Digite el aris: ");
		aris=n.nextInt();
		if (aris<0) { System.out.println("Error, No se aceptan datos negativos");}
		}while(aris<0);
	
		aris=5;
		A=3*Math.pow(aris, 2)*Math.sqrt(25+10*Math.sqrt(5));
		V=((1*(15+7*Math.sqrt(5))*Math.pow(aris, 3)/4));
		
		System.out.println("******Datos del Dodecaedro******");
		System.out.println("El Area es :"+String.format("%.2f",A));
		System.out.println("El Volumen es "+String.format("%.2f",V));
		System.out.println("---------------------------------");
		do {
		System.out.println("Desea seguir en el programa? 1.Si 2.No");
		continuar=n.nextInt();
		if(continuar<0 || continuar>2) {System.out.println("Error, digite el dato denuevo");}
		}while(continuar<0 || continuar>2);
	}while(continuar==1);
		
		System.out.println("Fin del programa");
		
		n.close();
	}



}
