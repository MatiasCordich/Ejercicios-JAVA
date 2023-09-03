package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // DISEÑAR UN ALGORITMO QUE CALCULA LA LONGITUD DE LA CIRCUNFERENCIA Y EL AREA DE UN CIRCULO DE RADIO A RADIO

        Scanner sc = new Scanner(System.in);

        Circulo cir1 = new Circulo();

        System.out.print("Ingrese el radio del circulo: ");
        cir1.radio = sc.nextDouble();

        System.out.println("------------------------");
        System.out.println("Circunferencia: " + cir1.getCircunferencia());
        System.out.println("Area: " + cir1.getAreaCirculo());
        System.out.println("------------------------");

        sc.close();
    }
}
