/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreçãoProva;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author 20212PF.CC0020
 */
public class Questao2 {

    private String[] dados = {"80", "1500", "b", "-2", "c", "-50", "22", "6"};

    public Questao2() {
        classificacao();
    }

    private void classificacao() {
        
        Collection <Integer> rt = new TreeSet();
        for(String p : dados){
            
            try{
                Integer i = Integer.valueOf(p);
                rt.add(i);
                
            }catch(Exception e){
                rt.add(0);
            }
        }
        
        System.out.println(rt);
    }

    public static void main(String[] args) {
        new Questao2();
    }
    
}
