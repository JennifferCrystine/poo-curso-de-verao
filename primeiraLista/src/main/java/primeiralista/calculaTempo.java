/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

import static primeiralista.primeiraLista.leiaInteiro;

/**
 * questão 16
 * @author jenniffer
 */
public class calculaTempo {
    public static int pegaTempo() {
             int tempo = leiaInteiro("Digite a quantidade de segundos a ser transformada: ");            
             return tempo;
        }
         
    public static void transformaHora() {
        int tempo = pegaTempo();
        int horas = 0, minutos = 0;        
        horas = tempo / 3600; 
        minutos = tempo % 3600;
        System.out.println("Horas: "+horas);
        transformaMinuto(minutos);
        

    } 
    
    public static void transformaMinuto(int tempo) {
        // 1min = 60s        
        int minutos, segundos;
        minutos = tempo / 60;
        segundos = minutos % 60; 
        
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos); 
    
    }
    public static void main(String[] args) {
        transformaHora();
        
    }
        
}
    

