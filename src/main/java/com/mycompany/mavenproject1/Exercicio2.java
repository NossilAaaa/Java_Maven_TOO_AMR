/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Exercicio2 {

    static int[][] rgDados1 = new int[3][3];

    static int[][] rgDados2 = new int[3][3];

    static int[][] rgDados3 = new int[3][3];

    public static void main(String[] args) {

        /*
            2) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
         */
        Scanner x = new Scanner(System.in);

        for (int linha = 0; linha < rgDados1.length; linha++) {

            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.println("Digite um valor: ");

                boolean erro = true;
                while (erro) {
                    try {
                        if (x.hasNext()) {
                            int i = Integer.parseInt(x.next());
                            rgDados1[linha][coluna] = i;
                            System.out.println("Valor: " + i + " inserido 1");
                            erro = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: " + e.getLocalizedMessage() + " tente novamente");
                        erro = true;
                    }

                }

            }
        }
        
        for (int linha = 0; linha < rgDados2.length; linha++) {

            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {

                System.out.println("Digite um valor: ");

                boolean erro = true;
                while (erro) {
                    try {
                        if (x.hasNext()) {
                            int i = Integer.parseInt(x.next());
                            rgDados2[linha][coluna] = i;
                            System.out.println("Valor: " + i + " inserido 2");
                            erro = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: " + e.getLocalizedMessage() + " tente novamente");
                        erro = true;
                    }

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
