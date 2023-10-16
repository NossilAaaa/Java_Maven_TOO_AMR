/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreçãoProva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20212PF.CC0020
 */
public class Questao3 {

    private Questao3() {
        datas();
    }

    private void datas(){
        Set<Calendar> lst = new TreeSet();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        /*
        17:20:00
        18:20:00
        19:20:00
        06:00:00
        02:59:00
        */
        String vt[]= {"17:20:00", "18:20:00", "19:20:00", "06:00:00", "02:59:00"};
        
        for(String d : vt){
            try {
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(ft.parse(d).getTime());
                lst.add(c);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        for(Calendar cld : lst)
            {
                System.out.println(ft.format(cld.getTime()));
            }      
        
        
    }

    public static void main(String args[]) {
        new Questao3();
    }

}
