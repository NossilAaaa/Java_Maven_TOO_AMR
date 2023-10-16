/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aliss
 */
public class TesteDatas {

    private Calendar dataCalendar;//atributo da instancia

    private Date dateDate;
    
    private SimpleDateFormat formatador;
   

    public TesteDatas() throws ParseException {
        System.out.println("teste com datas::");

        dataCalendar = Calendar.getInstance();//inicialização de um Calendar
        
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12);//altera data
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 0);
        
        formatador = new SimpleDateFormat("dd/MM/yyyy");//mm = minutos;
        
        String data_formata = formatador.format(dataCalendar.getTime());

        //System.out.println(dataCalendar); // marco 0 = 01/01/1970
        System.out.println(data_formata);
        System.out.println("Data em milisegundos: "+ dataCalendar.getTimeInMillis());
        
        dateDate = new Date();
        System.out.println(dateDate);
        data_formata = formatador.format(dateDate);
        System.out.println("Data_formatada (java.util.Date): "+data_formata);
        System.out.println("data java.util.Date em milis:" +dateDate.getTime());
        
        //Exerc_1: imprimir a diferença em milis e em dias entre dateDate e dataCalendar;
        
        long Diferenca = dateDate.getTime() - dataCalendar.getTimeInMillis();
        System.out.println("Diferença em mili: "+ Diferenca);
        System.out.println("Diferença em dias: "+ Diferenca/86400000);
        
        long miliCalendar = dataCalendar.getTimeInMillis();
        long miliDate = dateDate.getTime();
        
        //Exerc_2: utilizar o metódo compareTo da classe Calendar para testar duas datas
        
        System.out.println("data maior - retorno 1: "+dateDate.compareTo(dataCalendar.getTime()));
        System.out.println("data iguais - retorno 0: " +dateDate.compareTo(dateDate));
        
        // e explique os retornos: -1, 0, 1; // converte de date para calendar
        
        //Exerc_3: converter a string "25/09/1983" para java.util.calendar
        try{
            java.util.Date dt = formatador.parse("25/09/1983");
            //conversão
            Calendar calendar_test = Calendar.getInstance();
            calendar_test.setTime(dt);
            
            Calendar calendar_test_2 = Calendar.getInstance();
            calendar_test_2.setTime(formatador.parse("25/09/1983"));
        }catch(ParseException ex){
            System.out.println("erro: "+ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        
        //Exerc_4: converter a string "25/08/1983" para java.util.date
       
        
    }

    public static void main(String[] args) throws ParseException{

        new TesteDatas();//criação da instancia
    }
}
