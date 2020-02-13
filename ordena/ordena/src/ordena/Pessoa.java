/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
    
public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Entre com o nome: ");
    nome = teclado.nextLine();
    System.out.print("Entre com a idade de " + nome + ": ");
    idade = teclado.nextInt();
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
  
  public void exibe() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}

