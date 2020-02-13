/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Leitor {
    private String nome;
    private String telefone;
    private String endereco;
    private int identificador; 
    private static int proximoId = 1;
    
   
    
    public Leitor(String nome, String telefone, String endereco, int identificador){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.identificador = identificador;       
    }    
    
    public Leitor(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Informe seu telefone: ");
        this.telefone = teclado.nextLine();
        System.out.println("Informe seu endereço: ");
        this.endereco = teclado.nextLine();        
        this.identificador = proximoId++; 
    
    }
  
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdentificador() {
        return identificador;
    }

    
    
    
    
    
    public void exibeLeitor() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Telefone: "+this.telefone);
        
    }
}



