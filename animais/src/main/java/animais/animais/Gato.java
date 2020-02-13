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
public class Gato extends Animal {
    private String nome;
    
    public Gato(String nome) {
        this.nome = nome;
    }
    
    
    
    public String fala(Animal animal) {
        String frase = "Miau";
        
        return frase;       
    
    }
    
    public void comunica() {
        System.out.println(this.nome+" miou: "+fala(this));
    
    }
    
}
