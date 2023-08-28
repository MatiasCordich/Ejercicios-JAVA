package Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Rectangulo jorge = new Rectangulo();

        System.out.print("Ingrese la base: ");
        jorge.base = sc.nextDouble();
        System.out.println("---------------------");
        System.out.print("Ingrese la altura: ");
        jorge.altura = sc.nextDouble();
        System.out.println("---------------------");
        System.out.println("La base es: " + jorge.base);
        System.out.println("La altura es: " + jorge.altura);
        System.out.println("---------------------");
        System.out.println("El perimetro es: " + jorge.perimetro());
        System.out.println("El area es: " + jorge.area());

        sc.close();
    }
}
