/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

/**
 *
 * @author Aluno
 */
public class Agenda {
  private Pessoa[] pessoas;

  public Agenda(int numeroPessoas) {
    pessoas = new Pessoa[numeroPessoas];
    for (int i = 0; i < pessoas.length; i++) {
      pessoas[i] = new Pessoa();
    }
  }
  
  public int getTamanhoAgenda() {
      return pessoas.length;
  }
  
    public void ordena(Ordena o) {
        o.ordena(this.pessoas);
    }
  
  

  public void exibe() {
    System.out.println("----------");
    for (int i = 0; i < pessoas.length; i++) {
      pessoas[i].exibe();
      System.out.println("----------");
    }
  }
  
    public static void main(String[] args) {
        Agenda agenda = new Agenda(3);
        OrdenaIdade ordenaIdade = new OrdenaIdade();
        OrdenaNome ordenaNome = new OrdenaNome();
        System.out.println("Agenda sorted by shuffle: ");
        agenda.exibe();
        agenda.ordena(ordenaNome);
        System.out.println("Agenda sorted by Nome: ");
        agenda.exibe();
        agenda.ordena(ordenaIdade);
        System.out.println("Agenda sorted by Idade: ");
        agenda.exibe();
        
        
    }
}
