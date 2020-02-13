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
public class Criacao {
    Animal[] animais = new Animal[10];
    
    public Criacao() {
        animais[0] = new Homem("Cleiton");
        animais[1] = new Homem("Uesley");
        animais[2] = new Homem("Deivison");
        animais[3] = new Gato("Bolinha de pelo");
        animais[4] = new Gato("Abacaxi");
        animais[5] = new Gato("Dune");
        animais[6] = new Gato("Bixinho");
        animais[7] = new Cachorro("Bob");
        animais[8] = new Cachorro("Luke");
        animais[9] = new Cachorro("Tob");        
    }
    
    public void olaMundo() {
        for(int i = 0; i < animais.length; i++) {
            animais[i].comunica(); 
        }
    }
    
    public static void main(String[] args) {
        Criacao criacao = new Criacao();
        criacao.olaMundo();
    }
    
    
    
}
