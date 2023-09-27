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
public class Pesquisa {

    private static int idade;
    private static String nome;
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int idade,qttotal,qth,qtm;
       String nome,sexo,resp,inicio;
       
      qttotal=0;
      qth=0;
      qtm=0;
      
  
      System.out.println("Deseja participar da Pesquisa? Responda S para Sim ou N para Não");
       inicio=sc.next();
       
       
       while (inicio.equals("S")|inicio.equals("s")|inicio.equals("Sim")|inicio.equals("sim")){
             System.out.println("Digite Nome:");
             nome=sc.next();
      
        
             System.out.println("Digite idade:");
             idade = sc.nextInt();
        
             System.out.println("Digite sexo:");
             sexo=sc.next();
        
     
             System.out.println("Gostou do Produto?:");
             resp = sc.next();
             
             qttotal++;
             
             if (sexo.equals("M")|sexo.equals("m")|sexo.equals("Masculino")|sexo.equals("masculino")){
                 qth++;
             }else if(sexo.equals("F")|sexo.equals("f")|sexo.equals("Feminino")|sexo.equals("feminino")){
                 qtm++;
             }
             
             
             System.out.println("Deseja participar da Pesquisa? Responda S para Sim ou N para Não");
               inicio=sc.next();
             
       }
             
System.out.println("Quantidade de participantes ="+qttotal);
System.out.println("Quantidade de Homens ="+qth);
System.out.println("Quantidade de Mulheres ="+qtm);


    }
}
    
         
            
        



   














   

    
    
    


