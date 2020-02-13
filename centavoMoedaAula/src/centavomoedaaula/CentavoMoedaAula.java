/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centavomoedaaula;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CentavoMoedaAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     
        System.out.println("Digite uma quantidade de centavos ");
        int centavos, moeda, cem, cinquenta, vinteCinco, dez, cinco, somaMoedas;
        centavos = teclado.nextInt();
        
        cem = centavos / 100;
        centavos = centavos % 100;
        
        cinquenta = centavos / 50;
        centavos = centavos % 50;
        
        vinteCinco = centavos / 25;
        centavos = centavos % 25;
        
        dez = centavos / 10;
        centavos = centavos % 10;
        
        cinco = centavos / 5;
        centavos = centavos % 5;
       
        
  
        
        System.out.println(+cem+ "moedas de 1real");
        System.out.println(+cinquenta+ "moedas de 50centavos");
        System.out.println(+vinteCinco+ "moedas de 25centavos");
        System.out.println(+dez+ "moedas de 10centavos");
        System.out.println(+cinco+ "moedas de 5centavos");
        System.out.println(+centavos+ "moedas de 1centavo");
        
        
        
        
        
        // TODO code application logic here
    }
    
}
