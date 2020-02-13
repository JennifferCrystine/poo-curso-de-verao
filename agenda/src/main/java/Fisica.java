
import java.util.Scanner;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniffer
 */
public class Fisica extends Pessoa {
    private String nome;
    private String cpf;
    private String nascimento;
    
    public Fisica() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Adicionando nova pessoa física: ");
        System.out.println("Nome: ");
        this.nome = teclado.nextLine();
        System.out.println("CPF: ");
        this.cpf = teclado.nextLine();
        System.out.println("Endereço: ");
        this.setEndereco(teclado.nextLine());
        System.out.println("Data de nascimento: ");
        this.nascimento = teclado.nextLine();;
    }

    public String getIdentificador(String identificador) {
        return cpf;
    
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }
    
    public void mostraPessoa() {
        System.out.println("-----------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("-----------------");
        System.out.println("CPF: "+this.cpf);
        System.out.println("-----------------");
        System.out.println("Endereço: "+this.getEndereco());
        System.out.println("-----------------");
        System.out.println("Data de nascimento: "+this.nascimento);
        System.out.println("-----------------");
    }
    
    
}
