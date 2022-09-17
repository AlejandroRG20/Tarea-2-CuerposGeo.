package Cuerposgeometricos2;

import java.util.Scanner;
public class Tetaedro {
public static void main(String[] args) {
		
		//Nombre de variables
		float  a;
		double area,volumen,H;
		int cont;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("----------TETAEDRO-----------");
		
do {		
		//Datos de entrada
	do {	
		System.out.println("Digite el Angulo: ");
		a=n.nextInt();
		if(a<0 || a>1000) {System.out.println("Erro, no se aceptan numeros negativos y mayores a mil");}		
	}while(a<0 || a>1000);	
	
	
		//Procesamiento
		area=Math.pow(a,2 )*Math.sqrt(3);
		volumen=(Math.sqrt(2)/2)*Math.pow(a, 3);
		H=a*( Math.sqrt(6)/3);
		
		System.out.println("-----------Datos del tetraedro----------");
		System.out.println("1.El Area del tetraedro es: "+String.format("%.2f",area));
		System.out.println("2.El Volumen es: "+String.format("%.2f",volumen));
		System.out.println("3.La H es: "+String.format("%.2f",H));
		System.out.println("----------------------------------------");
		
	do {	
		System.out.println("Deseaa seguir en el programa? 1.Si 2.No");
		cont=n.nextInt();
		if(cont<0 || cont>2) {System.out.println("Error, digite un dato valido");}
	}while(cont<0 || cont>2);
}while(cont==1);	
				
		System.out.println("Fin del programa");
		
		n.close();
		
	}



}
