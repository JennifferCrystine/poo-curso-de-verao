/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecoes;

/**
 *
 * @author jenniffer
 */
public class Distancia {
    private Ponto ponto1;
    private Ponto ponto2;
    private double distancia;
    
    
    public Distancia() {
        ponto1 = new Ponto();
        ponto2 = new Ponto();
    }
    
    public void calculaDistancia() {
        distancia = Math.sqrt(Math.pow(ponto1.getX() - ponto2.getX(), 2) 
                + Math.pow(ponto1.getY() - ponto2.getY(), 2) 
                    + Math.pow(ponto1.getZ() - ponto2.getZ(), 2));
        
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    public double getDistancia() {
        return distancia;
    }
    

    
    public static void main(String[] args) {
        Distancia distancia = new Distancia();
        distancia.calculaDistancia();
        System.out.println("Distancia: "+distancia.getDistancia());
    }
}
