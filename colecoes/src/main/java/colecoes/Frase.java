/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class Frase {
    List<String> palavras = new ArrayList<>();
    private String frase = new String();
    
    public String leiaFrase() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        frase = teclado.nextLine().trim();
        return frase;
    }
    
    public void pegaPalavras() {
        int inicio = 0;
        int fim = frase.indexOf(" ", inicio);
        while(fim != -1) {
            for(String palavra : palavras) {
                palavras.add(frase.substring(inicio, inicio + 1));
                inicio = fim + 1;
                fim = frase.indexOf(" ", inicio);
            }
        }
    }
    
    public void imprimeLista() {
        System.out.println("frase na lista");
        for(String palavra : palavras) {
            System.out.println(palavra);
        }
    
    }
    
    public void exibeFraseNormal() {
        System.out.println("frase digitada: ");
        System.out.println(frase);
    }
    
    public static void main(String[] args) {
        Frase frase = new Frase();
        frase.leiaFrase();        
        frase.exibeFraseNormal();
        frase.pegaPalavras();
        frase.imprimeLista();
    }
    
    
}
