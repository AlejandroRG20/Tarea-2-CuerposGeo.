package Cuerposgeometricos2;
import  java.util.*;
public class Cilindro {
	public static void main(String[] args) {
		// Declaracion de variables
		float  h , r ;
		double  areaLateral , areaTotal , volumen ;
	    int continuar;
	    Scanner n=new Scanner(System.in);
	    
do {
		//Datos de entrada
		
	do {
		System.out.println("Digite la altura del Cilindro");
		h=n.nextInt();
		if (h<0) { System.out.println("Error, No se aceptan numeros negativos");}
	    } while (h<0);
	    
	do {
		System.out.println("Digiinte el radio del cilindro");
		r=n.nextInt();
		if (r<0) { System.out.println("Error, No se aceptan numeros negativos");}
	    } while(r<0);
        	
        	//procesamiento
    		areaLateral = 2 * Math.PI * r * h ;
    		areaTotal = 2 * Math.PI * r *( h + r );
    		volumen = Math.PI * Math.pow ( r , 2 )* h ;
        	
		//Datos de salida (Resultados)
		System.out.println ( "******Datos del Cilindro******" );
		System.out.println ( "1.El Area lateral del  cilindro es :" + String . format ( "%.2f" , areaLateral ));
		System.out.println ( "2.El Area Total del cilindro es :" + String. format ( "%.2f" , areaTotal ));
		System.out.println ( "3.El Volumen del cilindro es :" + String . format ( "%.2f" , volumen ));
		
	do {
		System.out.println("Desea seguir en el programa? 1.Si 2.No");
		continuar=n.nextInt();
		if (continuar<0 || continuar>2) { System.out.println("Error,digite el dato denuevo");}
	    }while (continuar<0 || continuar>2);
   } while (continuar == 1);
	
	System.out.println("Fin del programa");
	
	
	n.close();
		}

}
