package Cuerposgeometricos2;
import java.util.*;
public class Hexaedro {
	public static void main(String[] args) {
		double am,AM,D,V;
		int continuar;
	
		Scanner n=new Scanner(System.in);
		
do {	
		
		
	do {
		System.out.println("Digite am del hexaedro: ");
		am=n.nextInt();
		if (am<0) { System.out.println("Error, No se aceptan  numeros negativos");}
		}while(am<0);
		
		am=2.25;
		AM=6*Math.pow(am, 2);
		V=Math.pow(am, 3);
		D=am*Math.sqrt(3);
		
		System.out.println("******Datos del hexaedro******");
	    System.out.println("El Area menor es :"+String.format("%.2f",am));
	    System.out.println("El Area mayor es :"+String.format("%.2f",AM));
	    System.out.println("El Volumen es:"+String.format("%.2f",V));
	    System.out.println("El Diametro es :"+String.format("%.2f",D));
		System.out.println("-------------------------------");
	    
	do {
	    System.out.println("Desea continuarr ene l programa? 1.Si 2.No");
	    continuar=n.nextInt();
	    if(continuar<0 || continuar>2) {System.out.println("Erro, digine un dato valido");}
	    }while(continuar<0 || continuar>2);
   }while(continuar==1);


     System.out.println("Fin del Programa");
     
     n.close();
     
	}


}
