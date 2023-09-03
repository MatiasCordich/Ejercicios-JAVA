package Ejercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DISEÑAR UN ALGORITMO QUE CALCULE LA SUPERFICIE DE UN TRIANGULO A PARTIR DEL INGRESO DE SU BASE Y ALTURA. DEBE MOSTRAR EL RESULTADO 

        Scanner sc = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();

        System.out.print("Ingrese la base del triangulo: ");
        triangulo1.base = sc.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        triangulo1.altura = sc.nextDouble();

        System.out.println("La superficio del triangulo es de: " + triangulo1.getAreaTriangulo() + " cm");

        sc.close();
    }
}
