package Cuerposgeometricos2;

import java.util.Scanner;

public class Prisma {
	public static void main(String[] args) {
		//Nombre de variables
		float areaLateral;
		float Pbase, h , n , l;
		double AnguloCentral,apotema,Abase,areaTotal,volumen;
		int continuar;
		Scanner nk=new Scanner(System.in);
		
		System.out.println("------PRISMA------");
do {		
	do {	
		System.out.println("Digite la altura: ");
		h=nk.nextFloat();
		if(h<0) {System.out.println("Error, no se aceptan datos negativos");}
	}while(h<0);
	
	do {	
		System.out.println("Digite la longitud del  lado: ");
		l=nk.nextFloat();
		if(l<0) {System.out.println("Error, no se aceptan datos negativos");}
	}while(l<0);
	
	do {	
		System.out.println("Digite la  cantidad de lados: ");
		n=nk.nextFloat();
		if(n<0) {System.out.println("Error, no se aceptan datos negativos");}
	}while(n<0);
		

		Pbase= n*l;
		areaLateral= Pbase*h;
		
		
		//procesamiento
		AnguloCentral= (360/n)*(Math.PI/180);
		apotema= l/(2*Math.tan(AnguloCentral/2));
		Abase= (Pbase*apotema)/2;
		areaTotal= areaLateral + 2*Abase;
		volumen = Abase*h;
		
		//Datos de salidas (Resultados)
		System.out.println("******Datos del prisma******");
		System.out.println("1.La Cantidad de lados es:"+n);
		System.out.println("2.La Longitud  de lados es:"+l);
		System.out.println("3.La Altura es:"+h);
		System.out.println("4.El Perimetro de la base es:"+Pbase);
		System.out.println("5.El Area de la base  es:"+String.format("%.2f",Abase));
		System.out.println("6.El apotema es:"+String.format("%.2f",apotema));
		System.out.println("7.El Area lateral es:"+areaLateral);
		System.out.println("8.El Area total es:"+String.format("%.2f",areaTotal));
		System.out.println("9.El Volumen es:"+String.format("%.2f",volumen));
		System.out.println("-------------FIN---------------");
	do {
		System.out.println("Desearia seguir en  el programa? 1.Si 2.No");
		continuar=nk.nextInt();
		if (continuar<0 || continuar>2) {System.out.println("Error, digite un dato valido");}
	}while(continuar<0 || continuar>2);
}while(continuar==1);	
		
System.out.println("Fin del programa");
nk.close();
	}



}
