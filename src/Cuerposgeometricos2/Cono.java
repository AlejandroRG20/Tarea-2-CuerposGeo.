package Cuerposgeometricos2;
import java.util.*;
public class Cono {
	public static void main(String[] args) {
		//Nombre de variables
		float r,h;
		double g,areaLateral,areaTotal,volumen;
		int continuar;
		Scanner n=new Scanner(System.in);
		
do {		
		
		
	do {
		System.out.println("Digite la altura del Cilindro");
		h=n.nextInt();
		if (h<0) { System.out.println("Error, No se aceptan numeros negativos");}
		} while (h<0);
		    
    do {
	    System.out.println("Diginte el radio del Cilindro");
		r=n.nextInt();
		if (r<0) { System.out.println("Error, No se aceptan numeros negativos");}
	   } while(r<0);
		
	
	
	//Procesamiento
	g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
	areaLateral=Math.PI*r*g;
	areaTotal=Math.PI*r*g+(Math.PI*Math.pow(r,2));
	volumen=(Math.PI*Math.pow(r,2)*h)/3;
	
	
	System.out.println("******Datos del cono******");
	System.out.println("1.El Area lateral es: "+String.format("%.2f",areaLateral));
	System.out.println("2.El Area Total es: "+String.format("%.2f",areaTotal));
	System.out.println("3.El Volumen es: "+String.format("%.2f",volumen));
	System.out.println("4.La Generatriz es: "+String.format("%.2f",g));
	
	do {
	System.out.println("Desea  continuar con el proframa? 1.Si 2.No");
	continuar=n.nextInt();
	if (continuar<0 || continuar > 2) { System.out.println("Error, Digite su dato denuevo");}
	} while (continuar <0 || continuar>2);	
	} while (continuar==1);
	
System.out.println("Fin del programa");

n.close();
	}
	
	
	
	
	

}
