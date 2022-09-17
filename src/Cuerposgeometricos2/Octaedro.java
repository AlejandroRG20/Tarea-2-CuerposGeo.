package Cuerposgeometricos2;
import java.util.Scanner;

public class Octaedro {
	public static void main(String[] args) {
		double a,A,V;
		int cont;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("----------OCTAEDRO----------");
		
do {		
	do {	
		System.out.println("Digite el Area Menor: ");
		a=n.nextDouble();
		if(a<0 || a>1000) {System.out.println("Error, no se aceptan datos negativos ni mayores a mil");}
	}while(a<0 || a>1000);		
		
		A=2*Math.pow(a, 2)*Math.sqrt(3);
		V=Math.sqrt(2)/3*Math.pow(a, 3);
		
		System.out.println("----------Datos del octaedro----------");
        System.out.println("El Area Menor es: "+String.format("%.2f",a));
        System.out.println("El Area Mayor es: "+String.format("%.2f",A));
        System.out.println("El Volumen es: "+String.format("%.2f",V));
        System.out.println("--------------------------------------");
        
     do {  
        System.out.println("Desea seguir en el programa? 1.Si 2.No");
        cont=n.nextInt();
        if(cont<0 || cont>2) {System.out.println("Error, digite  un dato valido");}
     }while(cont<0 || cont>2);
}while(cont==1);

System.out.println("Fin del programa");

n.close();
        
	}


}
