/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;


/**
 * questão 1
 * @author jenniffer
 */
public class equacaoSegundoGrau {
     public static int calculaDelta(int a, int b, int c){        
        int delta;        
        delta = (int) Math.pow(b, 2) - 4 * a * c;        
        return delta;
        
    }
    
    public static float [] calculaRaizes(int delta, int a, int b) {
        float[] raizes = new float[2];
        raizes[0]= (float)(-b +  Math.sqrt(delta)) / (2 * a);
        raizes[1] = (float)(-b -  Math.sqrt(delta)) / (2 * a);
        
        return raizes;

    }
    public static void main(String[] args) {
        int a, b, c, delta;
        float[] raizes = new float[2];
        raizes[0] = raizes[1] = 0;
        
        a = primeiraLista.pegaValor('A');
        b = primeiraLista.pegaValor('B');
        c = primeiraLista.pegaValor('C');
        
        delta = calculaDelta(a, b, c);
        raizes = calculaRaizes(delta, a, b);
        System.out.println("Delta: " +delta);
        System.out.println("A raiz x1 eh: "+raizes[0]);
        System.out.println("A raiz x2 eh: "+raizes[1]);
    
    }
}
