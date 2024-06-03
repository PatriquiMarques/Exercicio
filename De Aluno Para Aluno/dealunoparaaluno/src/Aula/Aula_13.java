
package Aula;

import java.util.Scanner;


public class Aula_13 {
    
    public static void main (String[] Args){
        
        final double PI = 3.1456;
       Scanner input = new Scanner(System.in);
       
         
        System.out.println(" Digite a area do raio");
        double raio = input.nextDouble();
        double area = raio * raio * PI;
      
        System.out.println("O valor da area é " + area);
        
        
    }
}
