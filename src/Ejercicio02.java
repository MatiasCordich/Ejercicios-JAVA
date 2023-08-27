import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) throws Exception {

        // ESCRIBIR UN ALGORITMO NECESARIO PARA CALCULAR Y MOSTRAR EL CUADRADO DE UN
        // NUMERO. EL NUMERO DEBE SER MAYOR QUE CERO, EN CASO DE ERROR QUE APAREZCA EL
        // MENSAJE DE "ERROR: EL NUMERO DEBE SER MAYOR QUE CERO "

        int numero;
        int cuadradoNumero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        numero = sc.nextInt();

        if (numero > 0) {

            cuadradoNumero = numero * numero;

            System.out.println("El cuadrado de " + numero + " es: " + cuadradoNumero);

        } else {
            System.out.println("ERROR: El numero debe ser mayor que cero");
        }

        sc.close();

    }
}
