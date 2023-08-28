package Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Circulo circ1 = new Circulo();
        Circulo circ2 = new Circulo();

        System.out.print("Ingrese radio de primer circulo: ");
        circ1.radio = sc.nextDouble();

        System.out.print("Ingrese radio de segundo circulo: ");
        circ2.radio = sc.nextDouble();

        System.out.println("Circulo 1");
        System.out.println("Radio: " + circ1.radio);
        System.out.println("Diametro: " + circ1.diametro());
        System.out.println("Perimetro: " + circ1.perimetro());
        System.out.println("Area: " + circ1.area());
        System.out.println("-----------------------");
        System.out.println("Circulo 2");
        System.out.println("Radio: " + circ2.radio);
        System.out.println("Diametro: " + circ2.diametro());
        System.out.println("Perimetro: " + circ2.perimetro());
        System.out.println("Area: " + circ2.area());
        System.out.println("-----------------------");
        
        if (circ1.radio > circ2.radio) {
            System.out.println("El circulo mas grande es el primero");
        } else {
            System.out.println("El circulo mas grande es el segundo");
        }

        sc.close();
    }
}
