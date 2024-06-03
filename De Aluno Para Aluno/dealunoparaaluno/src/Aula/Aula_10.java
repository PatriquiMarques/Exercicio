
package Aula;

import java.util.Scanner;

//https://www.youtube.com/watch?v=kkOSweUhGZM&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL

// AULAS 10, 11 
public class Aula_10 {
  
       public static void main (String []Args){
           
        Scanner input = new Scanner (System.in);
        double base, altura, areaRetangulo;
        
       System.out.println(" Informe o valor da base");
       base = input.nextDouble();
       
       System.out.println(" Informe o valor da altura");
       altura = input.nextDouble();
      
        
        areaRetangulo= base * altura;
        
        System.out.println(" A área de triangulo de base igual a " + base);
        System.out.println(" e altura  " + altura);
        System.out.println(" é " + areaRetangulo);
    }
}      