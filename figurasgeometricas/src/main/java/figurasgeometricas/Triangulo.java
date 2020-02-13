/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class Triangulo extends FiguraGeometrica {
    private double altura;
    private double base;
    private double area;
    
    public Triangulo() {
        System.out.println("Insira a base ");
        Scanner teclado = new Scanner(System.in);
        base = teclado.nextDouble();
        System.out.println("Insira a altura ");
        altura = teclado.nextDouble();
    }
    
    public void calculaArea() {
        area = (float)(base * altura)/2;
    }
    
     public void exibeTriangulo(String medida) {
        System.out.println("Sou um TRIANGULO com base "+base+" e altura "+altura+". "
                + "Minha área em é "+area+medida);
    }
     
     public static void main(String[] args) {
        System.out.println("Em qual medida está esse valor? ex: cm, km, mm...");
        Scanner teclado = new Scanner(System.in);
        String medida = teclado.next();
        Triangulo triangulo = new Triangulo();
        triangulo.calculaArea();
        triangulo.exibeTriangulo(medida);
    }
}
