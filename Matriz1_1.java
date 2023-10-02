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



     public static void main(String[] args) 
      Scanner sc = new Scanner(System.in);
      
            
    public class Exercicio Matriz {

    
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);        
         int matriz[][] = new int[5][2];
       int dobro[][] = new int[5][2];
       
       for(int i=0;i<=4;i++){
           for(int j=0;j<=1;j++){
           System.out.println("digite Número: ");
           matriz[i][j]=sc.nextInt();
           dobro[i][j]=matriz[i][j]*2;          
       }
       }
       
       for(int i=0;i<=4;i++){
           for(int j=0;j<=1;j++){
           System.out.println("Dobro de "+matriz[i][j]+" = "+dobro[i][j]);
       }
     }
       
    }
   

    
              
              
          
        
        


 
  
  
  
    





