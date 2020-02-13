/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

import java.util.Scanner;
import primeiralista.primeiraLista;
/**
 *
 * @author jenniffer
 */
public class calculaJurosAnual {
                  
        /*questão 10*/
            //M=C(1+i)t
        public static double pegaCapital() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Entre com a quantia a ser aplicada: ");
            double capital = teclado.nextDouble();
            return capital;            
        }
        
         public static float pegaTaxa() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Entre com a taxa de juros mensal: ");
            float taxa = teclado.nextFloat();
            taxa = (float)taxa/100;
            return taxa;            
        }
         

    
            public static double jurosComposto() {
            final int MES = 12;
            double montante;
            double capital = pegaCapital();
            float taxa = pegaTaxa();
            montante = capital*Math.pow(1+taxa, MES);
            
            
            return montante; 
        
        } 
      
        public static double calculaJurosAnual() {
            final int MES = 12;
            double capital = pegaCapital();
            float taxa = pegaTaxa(); 
            System.out.println("Capital: "+capital+"Taxa: "+taxa);
            float juros =(float) Math.pow((1 + taxa), MES);                      
            capital = capital * juros;
            
            return capital;   
        }
        
        public static void main(String[] args) {
                 
       
            //M=C(1+i)t
        char opcao;
         double capital, montante = 0;
         do{
             capital = calculaJurosAnual();
             montante = montante + capital;
             System.out.println("Saldo do investimento: "+montante);
             opcao = primeiraLista.leiaChar("Deseja continuar? Pressione 'S' para SIM e 'N' para Sair");
         
         }while(opcao == 'S' || opcao == 's');
        
        
        
        }
    
}
