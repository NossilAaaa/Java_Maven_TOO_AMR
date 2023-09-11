/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aliss
 */
import java.util.Scanner;

public class Exercicio1 {        
    
    public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
    
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e 
               inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes 
               (rgDados1 e rgDados2) e armazene em rgDados3. 
               Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Digite um valor: ");
                if(sc.hasNext()){
                    int i = Integer.parseInt(sc.next());
                    rgDados1[linha][coluna] = i;
                    System.out.println("Valor: " + i + " inserido1");
                }                
            }                        
        }       
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna = 0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.println("Digite um valor pra rg2: ");
                if(sc.hasNext()){
                    int f = Integer.parseInt(sc.next());
                    rgDados2[linha][coluna] = f;
                    System.out.println("Valor: " + f + " inserido");
                    
                }
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.printf("%d \t", rgDados1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.printf("%d \t", rgDados2[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                rgDados3[i][j] = rgDados1[i][j] + rgDados2[i][j];
            }
           
        }
        System.out.println(" ");
        System.out.println(" ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.printf("%d \t", rgDados3[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
}
