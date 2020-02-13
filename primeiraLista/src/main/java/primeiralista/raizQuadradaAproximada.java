/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.primeiraLista;

/**
 * questão 11
 * @author jenniffer
 */
public class raizQuadradaAproximada {
    public static float calculaRaizQuadrada(float radical, float erroMaximo) {
        float i, erro = 0, inicio = 0, fim = radical, raiz = 0;
        do {
            raiz = (inicio + radical) / 2;
            erro = (inicio + radical) / 2;
            if(raiz * raiz == radical)  return raiz;
            else if(raiz * raiz < radical) {
                fim = radical / 2;
                raiz = (inicio + fim) / 2;
                erro = (inicio + fim) / 2;
                
            }
            else if(raiz * raiz > radical) {
                inicio = radical / 2;
                fim = radical;           
            }
        
        }while(erro > erroMaximo || (raiz * raiz) != radical);
        
        return raiz;
    }
    
    public static void main(String[] args) {
        float radical = primeiraLista.leiaFloat("Que raiz quadrada quer descobrir? ");
        float erroMaximo = primeiraLista.leiaFloat("Qual eh o erro maximo permitido? ");
        float raiz = calculaRaizQuadrada(radical, erroMaximo);
        System.out.println("A raiz quadrada aproximada eh: "+raiz);
        System.out.println("A raiz exata eh: "+Math.sqrt(raiz));
        System.out.println("O erro maximo que voce admitia era: "+erroMaximo);
        System.out.println("O erro maximo real foi: "+(radical-raiz));
    
    }

}
