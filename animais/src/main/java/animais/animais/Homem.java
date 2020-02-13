/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais.animais;

/**
 *
 * @author jenniffer
 */
public class Homem  extends Animal {
    private String nome;
    
    public Homem(String nome) {
        this.nome = nome;
    }
    
    public String fala(Animal animal) {
        String frase = "Oi";
        
        return frase;     
    }
    
    public void comunica() {
        System.out.println(this.nome+" disse: "+fala(this));
    
    }
    
}
