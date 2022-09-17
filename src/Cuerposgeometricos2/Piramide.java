package Cuerposgeometricos2;
import java.util.*;
public class Piramide {
		public static void main(String[] args) {
			//Declaracion de variables
					double  Pbase, h, l, Abase, areaLateral, volumen, areaTotal, ap, Ap;
					int continuar;
					Scanner nk=new Scanner(System.in);
					
					System.out.println("--------PIRAMIDE--------");
					//Datos de entrada
			do {		
				do {	
					System.out.println("Digite la Altura: ");
					h=nk.nextDouble();
					if(h<0) {System.out.println("Error, No se aceptan datos negativos");}
				}while(h<0);
				
				do {	
					System.out.println("Digite la Longitud de los lados: ");
					l=nk.nextDouble();
					if(l<0) {System.out.println("Error, No se aceptan datos negativos");}
				}while(l<0);
									
					//Procesamiento de datos
					
					ap = l/2;
					Ap = Math.sqrt(Math.pow(h, 2)+ Math.pow(ap, 2));
					Pbase = 4*l;
					Abase = l*l;
					areaLateral = (Pbase*Ap)/2;
					areaTotal = areaLateral + Abase;
					volumen = (Abase * h)/3;
					
					//Datos de Salida
					System.out.println("----------------Datos de la piramide--------------");
					System.out.println("1.La altura dela piramide es: " + h);
					System.out.println("2.La LONGITUD de los lados de la piramide es: " + l);
					System.out.println("3.El Perimetro de la base de la piramide es: " + 	String.format("%.2f", Pbase));
					System.out.println("4.El Area de la base de la piramide es: " + String.format("%.2f", Abase));
					System.out.println("6.El AREA TOTAL de la piramide es: " + String.format("%.2f", areaTotal));
					System.out.println("7.El AREA LATERAL de la piramide es: " + String.format("%.2f", areaLateral));
					System.out.println("8.El VOLUMEN de la piramide es: " + String.format("%.2f", volumen));
					System.out.println("------------------------FIN--------------------------");
	
					
				do {	
					System.out.println("Desea seguir en el programa? 1.Si 2.No");
					continuar=nk.nextInt();
					if(continuar<0 || continuar>2) {System.out.println("Error, digite un dato valido");}
				}while(continuar<0 || continuar>2);
			}while(continuar==1);	
				
				System.out.println("Fin del programa");	
					
				nk.close();
					
		}
	

}
