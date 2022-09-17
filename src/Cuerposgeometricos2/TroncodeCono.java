package Cuerposgeometricos2;
import java.util.*;
public class TroncodeCono {
public static void main(String[] args) {
		
		//Nombre de variables
		float r,R,h;
		double areaLateral,Volumen,areaTotal,g,AB,Ab;
		int continuar;
		Scanner n=new Scanner(System.in);
		
		System.out.println("-----------TRONCO DE CONO----------");
		
do {		
		//Datos de entrada
	do {	
		System.out.println("Digite el radio: ");
		r=n.nextFloat();
		if (r<0 || r>1000) {System.out.println("Error, no aceptan datos negativos o mayores a mil");}
	}while(r<0 || r>1000);	
	
	do {	
		System.out.println("Digite el Rango: ");
		R=n.nextFloat();
		if (R<0 || R>1000) {System.out.println("Error, no aceptan datos negativos o mayores a mil");}
	}while(R<0 || R>1000);	
		
	do {	
		System.out.println("Digite la Altura: ");
		h=n.nextFloat();
		if (h<0 || h>1000) {System.out.println("Error, no aceptan datos negativos o mayores a mil");}
	}while(h<0 || h>1000);
		
		//Procesamiento
		AB=Math.PI*Math.pow(R,2);
		Ab=Math.PI*Math.pow(r,2);
		g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
		areaLateral= Math.PI*g*(R+r);
		areaTotal=areaLateral+AB+Ab;
		Volumen=(Math.PI*h*(Math.pow(R,2)+Math.pow(r,2)+R*r)/3);
		
		System.out.println("----------Datos del tronco de cono----------");
		System.out.println("1.El Area lateral es: "+String.format("%.2f",areaLateral));
		System.out.println("2.El Area Totale es: "+String.format("%.2f",areaTotal));
		System.out.println("3.El Volumen es: "+String.format("%.2f",Volumen));
		System.out.println("4.La Generatriz es: "+String.format("%.2f",g));
		
	do {	
		System.out.println("Desea  seguir en el programa? 1.Si 2.No");
		continuar=n.nextInt();
		if(continuar<0 || continuar>2) {System.out.println("Error, digite un dato valido");}
	}while(continuar<0 || continuar>2);
}while(continuar==1);	
		

System.out.println("Fin del programa");

n.close();
		
	}

}
