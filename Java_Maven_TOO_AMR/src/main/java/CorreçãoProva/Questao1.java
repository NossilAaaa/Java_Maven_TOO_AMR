/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreçãoProva;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 20212PF.CC0020
 */
public class Questao1 {

    public Questao1(String param) {
        imprime(extracaoInteiros(param));
        //Collection<Integer> rt = extracaoInteiros(param);
        //imprime(rt);
    }
    
    private void imprime(Collection<Integer> param){
        System.out.println(param);
    }

    private Collection<Integer> extracaoInteiros(String param) {
            
            Collection<Integer> retorno = null;
            retorno = new ArrayList();
            
            String partes[] = param.split(",");
            for(String p: partes){
                System.out.println(p);
                //[{codigo: 123}]
                p = p.substring(p.indexOf(":")+ 2, p.indexOf("}"));
                System.out.println("\t" + p);
                //retorno.add(Integer.parseInt(p));
                Integer i = Integer.valueOf(p);
                retorno.add(i);
            }
            
          return retorno;  
    }

    public static void main(String[] args) {
        String json = "[{codigo: 123}, {codigo: 0}, {codigo: 59}]";
        new Questao1(json);
    }
}
