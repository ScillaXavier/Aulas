/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */


public class Matriz1 {
    
    

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
            
    
      int numeros[][] = new int[3][3];
      
      for (int i=0;i<=2;i++){
          for (int j=0;j<=2;j++){
              System.out.println("Digite o Numero: ");
              numeros[i][j]=sc.nextInt();
          }
      }
        
         System.out.println("Números Armazenados na Matriz de Dados");
      
              
        for (int i=0;i<=2;i++){
            System.out.println("");
          for (int j=0;j<=2;j++){
              System.out.print(numeros[i][j]+" ");
          }
        }
        

  }
}
              
              
          
        
        


 
  
  
  
    





