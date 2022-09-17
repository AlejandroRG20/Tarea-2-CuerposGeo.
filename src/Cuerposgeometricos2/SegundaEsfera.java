package Cuerposgeometricos2;
import java.util.*;
public class SegundaEsfera {
	//Nombre de variables
		public static void main(String[] args) {
	float h,r,R;
	double areaZonaesferica,volumenEsferico,AreacasqueteEsferico,VolumenCasqueteEsferico;
	int continuar;
	
	Scanner n=new Scanner(System.in);
	
do {
	
	//Datos de entrada
	
	do {
	    System.out.println("Digite el radio de la esfera: ");
	    r=n.nextInt();
	    if(r<0) { System.out.println("Error, No se aceptan datos negativos");}
	    }while(r<0);
	
	do {
		System.out.println("Digite la altura de la esfera: ");
		h=n.nextInt();
		if(h<0) { System.out.println("Error, No se aceptan datos negativos");}
		}while(h<0);
	
	do {
		System.out.println("Digite R de la esfera: ");
		R=n.nextInt();
		if(R<0) { System.out.println("Error, No se aceptan datos negativos");}
		}while(R<0);

	//Procesamiento
	areaZonaesferica=2*Math.PI*R*h;
	volumenEsferico=(Math.PI *h*(Math.pow(h,2)+(3*Math.pow(R,2) + 3*Math.pow(r, 2))))/6;
	AreacasqueteEsferico=2*Math.PI*R*h;
	VolumenCasqueteEsferico=(Math.PI *Math.pow(h,2)*(3*R-h)/3 );

	//Datos de salida

	System.out.println("******Datos de la Segunda esfera******");
	System.out.println("---Zona esferica--- ");
	System.out.println("1.Area de la zona esferica: "+ String.format("%.2f",areaZonaesferica));
	System.out.println("2.Volumen de la zona esferica: "+ String.format("%.2f",volumenEsferico));
	System.out.println("---Casquete esferico--- ");
	System.out.println("1.Area del casquete esferico: "+ String.format("%.2f",AreacasqueteEsferico));
	System.out.println("2.Volumen del casquete esferico: "+ String.format("%.2f",VolumenCasqueteEsferico));
	
	
	do {
	System.out.println("Desea seguir en el programa? 1.Si 2.No");
	continuar=n.nextInt();
	if(continuar<0 || continuar>2) { System.out.println("Error, digite el dato denuevo");}
	}while(continuar<0 || continuar>2);
}while(continuar==1);
	
System.out.println("Fin del programa");

n.close();

		}
		
	


}
