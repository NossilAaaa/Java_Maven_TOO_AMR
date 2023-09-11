package com.mycompany.mavenproject1;

public class Exercicio4 {

    /*
      4) Teste e recupere duas informações recebidas por parâmetro no método main. Para isso execute 
          a main informando dois valores. 
         Caso os valores sejam inteiros positivos. Calcule a média e imprima na tela o resultado. 
         Caso contrário, informe e finalize o programa.
             
        Comando para compilação (a partir do diretorio java): javac br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4.java
    
        Comando para execução (a partir do diretorio java): java br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4
     */
    public Exercicio4() {

    }

    public static void main(String[] args) {
    if (args.length == 2) {
        try {
            float num1 = Float.parseFloat(args[0]);
            float num2 = Float.parseFloat(args[1]);

            if (num1 > 0 && num2 > 0) {
                float media = (num1 + num2) / 2;
                System.out.println("A media dos valores e: " + media);
            } else {
                System.out.println("Os valores devem ser inteiros positivos.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Os argumentos nao sao números validos.");
        }
    } else {
        System.out.println("E necessrio passar exatamente 2 argumentos.");
    }
}

}
