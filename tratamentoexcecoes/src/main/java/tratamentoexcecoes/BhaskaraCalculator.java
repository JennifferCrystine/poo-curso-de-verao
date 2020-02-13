/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecoes;

import java.util.Scanner;

import java.util.InputMismatchException;


/**
 *
 * @author jenniffer
 */
public class BhaskaraCalculator {
        private double delta;
        private double[] raizes = new double[2];
    
    public void calculaDelta(double a, double b, double c){     
        delta =  Math.pow(b, 2) - 4 * a * c;      
    }
    
    public void calculaRaizes(double a, double b) {  
        raizes[0]= (double)(-b +  Math.sqrt(delta)) / (2 * a);
        raizes[1] = (double)(-b -  Math.sqrt(delta)) / (2 * a);
    }

    public double getDelta() {
        return delta;
    }

    public double[] getRaizes() {
        return raizes;
    }

    
    public static int pegaValor(char coeficiente) {
        System.out.println("Digite o coeficiente " +coeficiente+ " da equacao");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        return valor;      
    }

    
    public static void main(String[] args) {
        double a, b, c;
        BhaskaraCalculator delta = new BhaskaraCalculator();
        float[] raizes = new float[2];
        raizes[0] = raizes[1] = 0;

        //
        try {
            a = pegaValor('A');
            b = pegaValor('B');
            c = pegaValor('C');
            delta.calculaDelta(a, b, c);
            delta.calculaRaizes(a, b);
           
        

        } catch(InputMismatchException excp) {
            System.out.println("Por favor, insira um número!");
            
        } finally {
          

            System.out.println("Delta: " +delta.getDelta());
            System.out.println("A raiz x1 eh: "+raizes[0]);
            System.out.println("A raiz x2 eh: "+raizes[1]);
    
        }
        
        

        
    
    }
    
}
