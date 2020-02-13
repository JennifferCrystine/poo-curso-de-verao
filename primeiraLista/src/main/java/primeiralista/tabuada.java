/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

/**
 *
 * @author jenniffer
 */
public class tabuada {
        /*questão 5*/
    public static void calculaTabuada() {
        int resultado = 0;
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++){
            resultado = i * j;
            System.out.println(i+" x "+j+" = "+resultado);
        
            } 
            System.out.println("-----------------------");
        }    
    }
    
    public static void main(String[] args) {
        calculaTabuada();
    
    }
    
}
