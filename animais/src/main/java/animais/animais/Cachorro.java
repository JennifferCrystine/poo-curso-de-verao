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
public class Cachorro extends Animal{
    private String nome;
    
    public Cachorro(String nome) {
        this.nome = nome;
    }
    
    public String fala(Animal animal) {
        String frase = "Au au";
        
        return frase;     
    
    }
    
    public void comunica() {
        System.out.println(this.nome+" latiu: "+fala(this));
    
    }
}

