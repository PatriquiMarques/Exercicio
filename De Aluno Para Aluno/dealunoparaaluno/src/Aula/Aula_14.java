
package Aula;

import java.util.Scanner;


public class Aula_14 {
    
    public static void main (String[] Arg){
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("Insira um valor em gramas");
      int gramas = input.nextInt();
      
      int kilos = gramas / 1000;
      gramas = gramas % 1000;
      
        System.out.println("O total de kilos é = " + kilos);
        System.out.println("O total de gramas é = " + gramas);
      
      
     
    
    }
    
}
