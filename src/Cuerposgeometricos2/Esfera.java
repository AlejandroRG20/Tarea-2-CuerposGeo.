package Cuerposgeometricos2;
import java.util.*;
public class Esfera {
	
	public static void main(String[] args) {
		//Nombrar variables
   float r;	
   double area,volumen;
   int continuar;
   
   Scanner n=new Scanner(System.in);
   
 do {  
   
   
   //Datos de entrada
   
   do {
   System.out.println("Digite el radio de la esfera: ");
   r=n.nextInt();
   if (r<0) { System.out.println("Error, No se aceptan numeros negativos");}
   } while(r<0);
   
   //Procesamiento
   area=4*Math.PI*Math.pow(r,2);
   volumen=4*Math.PI*Math.pow(r,3)/3;
   
   //Datos de salida
   
   System.out.println("******Datos de la esfera******");
   System.out.println("1.El Area de la base es: " + String.format("%.2f",area));
   System.out.println("2.El Volumen de la esfera es : "+String.format("%.2f",volumen));
		
   do {
   System.out.println("Desea seguir en el programa? 1.Si 2. No");
   continuar=n.nextInt();
   if(continuar<0 || continuar>2) { System.out.println("Error, vuelva a digitar el dato");}
	  } while(continuar<0 || continuar>2);
 }while(continuar==1);
 
 System.out.println("Fin del programa");
 
 
 
 n.close();
	}
	
  
  

}
