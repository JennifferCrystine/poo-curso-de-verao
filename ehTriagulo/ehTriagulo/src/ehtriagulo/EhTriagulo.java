/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehtriagulo;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EhTriagulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        System.out.println("Entre com as coordenadas do ponto 1: \n");
        Scanner teclado = new Scanner(System.in);
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        System.out.println("("+x1+" , "+y1+")");
        System.out.println("Entre com as coordenadas do ponto 2: \n");
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        System.out.println("("+x2+" , "+y2+")");
        System.out.println("Entre com as coordenadas do ponto 3: \n");
        x3 = teclado.nextFloat();
        y3 = teclado.nextFloat();
        System.out.println("("+x3+" , "+y3+")");
        
        //para descobrir o lado: ponto 1 - ponto 2
        double l1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
        double l2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
        double l3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow(y2 - y3, 2));
        
        //para descobrir quem eh o maior fazer hipotenusa
        if(((l1 + l2) < l3) || ((l1 + l3) < l2) || ((l2 + l3) < l1)) 
            System.out.println("nao eh triangulo!");
        if(l1 == l2 && l2 == l3)
            System.out.println("eh um triangulo equilatero");
        if(l1 == l2 || l2 == l3 || l1 == 3)
            System.out.println("eh um triangulo isosceles");
        if(l1 != l2 && l2 != l3 && l3 != l1)
            System.out.println("eh um triangulo escaleno");
            
        
        
        
        // TODO code application logic here
    }
    
}
