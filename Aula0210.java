/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 16128972023.1
 */
package aula0210;
//Leia o nome e a idade de 5 pessoas em vetor. Ao final mostrar o nome e a idade
//de todos.

import java.util.Scanner;
public class Matriz {
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nome[] = new String[5];
       int idade[] = new int[5];
       
       for(int i=0;i<=4;i++){
           System.out.println("Digite Seu Nome: ");
           nome[i] = sc.next();
           System.out.println("Digite sua Idade: ");
           idade[i]=sc.nextInt();                      
        }
       
       for(int i=0;i<=4;i++){  
           System.out.println("********Dados da "+(i+1)+"a Pessoa****** ");
           System.out.println("Nome = "+nome[i]);
           System.out.println("Idade = "+idade[i]);      
       }    
       
    }
   
}     


   














   

    
    
    


