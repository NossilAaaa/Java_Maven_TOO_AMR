/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aliss
 */
public class ManipulacaoStr {

    public ManipulacaoStr(String t1, String t2, String t3, String t4) {
        System.out.println("Construtor foi chamado! ");
        //testeComparaString(t1, t2, t3, t4);
        //testeSplit("1,2,3,4,5,6,7,a,b,c,8");
        testeSplit2("{codigo= 1},{codigo= 22},{codigo= 300}");
    }

    private void testeComparaString(String t1, String t2, String t3, String t4) {
        // testa as instancia?
        if (t1 == t2) {
            System.out.println("t1 tem a mesma instancia de t2");
        } else {
            System.out.println("t1 e t2 não tem a mesma instancia");
        }

        if (t1 == t3) {
            System.out.println("t1 tem a mesma instancia de t3");
        } else {
            System.out.println("t1 e t3 não tem a mesma instancia");
        }

        //equals: testa o conteudo;
        if (t1.equals(t2)) {
            System.out.println("t1 e t2 tem o mesmo conteudo");
        } else {
            System.out.println("t1 e t2 não tem o mesmo conteudo");
        }
    }

    private void testeSplit(String param) {
        //método java.lang.String.split;    
        String[] meuV;

        meuV = param.split(",");

        //System.out.println("length: "+meuV.length);
        for (int i = 0; i < meuV.length; i++) {
               try{
                   Integer item = Integer.parseInt(meuV[i]);
                   System.out.println(item);
               }catch(NumberFormatException e){
                   System.out.println("-");
               }
        }
        
        
        
    }
    
    private void testeSplit2(String param)
    {
        param = param.trim();//.trim, tira os espaçoes em brancos antes e depois caso exista;
        
        String[] meuVetor;        
        meuVetor = param.split(",");
        if(meuVetor.length == 0){
            System.out.println("vet possui zero partes");
        }else{
            for(String p : meuVetor ){
                System.out.println("p:" +p);
                System.out.println("Indice do espaço: "+p.indexOf(" "));//indexOf retorna um int;
                System.out.println("Indice do }: "+p.indexOf("}"));
                /*
                System.out.println("Valor: "+p.substring(
                                                        p.indexOf(" ")+1,
                                                        p.indexOf("}")));*/
                String subP= p.substring(
                                            p.indexOf(" ")+1,
                                            p.indexOf("}"));
                Integer valor = Integer.parseInt(subP);
                System.out.println(valor);
            }
        }    
    }

    public static void main(String[] args) {

        /*
            Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas 
            características que podem não ser óbvias para quem está tendo o seu primeiro contato com ela.
        
            Por exemplo, um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. 
            Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja 
            criada contendo a nova versão dele. Essas características serão o assunto que abordaremos primeiro.
        
         */
        String texto = "Qualquer texto entre aspas é uma String";
        String texto2 = new String("Qualquer texto entre aspas é uma String");
        String texto3 = "Qualquer texto entre aspas é uma String";
        String texto4 = new String("Qualquer texto entre aspas é uma String");

        new ManipulacaoStr(texto, texto2, texto3, texto4);
        //"Qualquer texto entre aspas é uma String".length();

        //String txt;
        //Testando igualdade entre Strings
        //comando: ==, equals, equalsIgnoreCase, compareTo, compareToIgnoreCase
        //Principais métodos da classe String: concat, String.valueOf, Length, startsWith endsWith, 
        //indexOf, substring, replace, trim
    }

    /*
        Fontes: 
            
            https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
            
     */
}
