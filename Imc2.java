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
public class Imc2 {

    private static int idade;
    private static String nome;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Double peso,altura,imc; 
       String nome,classi;
       int idade;
       String resp;
       classi=null;
       int contador = 0;
       int contaltura = 0;
       
               
       System.out.println("Deseja Calcular seu Imc? Responda S para Sim ");
       resp = sc.next();
       
       
       while (resp.equals("S")|resp.equals("s")){
             System.out.println("Digite Nome:");
             nome = sc.next();
        
             System.out.println("Digite idade:");
             idade = sc.nextInt();
        
             System.out.println("Digite peso:");
             peso = sc.nextDouble();
        
     
             System.out.println("Digite altura:");
             altura = sc.nextDouble();
             
             if(altura>1.70){
                 contaltura++;
             }
        
            imc = peso/(altura*altura);
        

            if(imc <=18.5) {
          System.out.println("Abaixo do peso normal");
          }       
           else if(imc<=24.9){
           System.out.println("Peso normal");
           }
          else if(imc<=29.9){
          System.out.println("Excesso de peso");
          }
          else if(imc<=34.9){
          classi = "Obesidade classe 1";
          }
          else if(imc<=39.9){
          classi = "Obesidade classe 2";
          }
          else {
          classi = "Obesidade classe 3";
          }
               
            System.out.println("Nome = "+nome+"Idade = "+idade);
            System.out.println("peso = "+peso+ "Altura ="+altura);
            System.out.println("Seu IMC é = "+imc);
            System.out.println("sua Classificação foi ="+classi);
            
            contador++;
           
            System.out.println("Deseja continuar ? Responda S para Sim");
            resp = sc.next();
            
        }
       
        System.out.println("Quantidade de Pessoas que Utilizaram ="+contador);
        System.out.println("Quantidade de altura >1.70 ="+contaltura);
}
}



   














   

    
    
    


