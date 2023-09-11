/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author aliss
 */
public class Exercicio3 {

    public static void main(String[] args) {

        int[][] rgDados1 = new int[2][3];//linha e coluna - se a quantidade de coluna da primeira

        int[][] rgDados2 = new int[3][2];//for igual a quantida de linha da segunda.

        int[][] rgDados3 = new int[rgDados1.length][rgDados2[0].length];

        /*
            3) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
         */
        for (int linha = 0; linha < rgDados1.length; linha++) {

            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                try {
                    String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                    rgDados1[linha][coluna] = Integer.parseInt(d);

                } catch (NumberFormatException d) {
                    String c = JOptionPane.showInputDialog("valor inserido nulo ou invalido", JOptionPane.ERROR_MESSAGE);

                }

            }
        }

        for (int linha = 0; linha < rgDados2.length; linha++) {

            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {

                try {
                    String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                    rgDados2[linha][coluna] = Integer.parseInt(d);

                } catch (NumberFormatException d) {
                    String c = JOptionPane.showInputDialog("valor inserido nulo ou invalido", JOptionPane.ERROR_MESSAGE);

                }

            }
        }

        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d \t", rgDados1[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d \t", rgDados2[i][j]);
            }
            System.out.println(" ");
        }

        for (int i = 0; i < rgDados1.length; i++) {
            for (int j = 0; j < rgDados2[0].length; j++) {
                rgDados3[i][j] = 0; // Inicialize o valor em rgDados3[i][j] como 0
                for (int k = 0; k < rgDados2.length; k++) {
                    rgDados3[i][j] += rgDados1[i][k] * rgDados2[k][j];
                }
            }
        }

// Imprima a matriz rgDados3
        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < rgDados3.length; i++) {
            for (int j = 0; j < rgDados3[0].length; j++) {
                System.out.printf("%d \t", rgDados3[i][j]);
            }
            System.out.println(" ");
        }

    }
}