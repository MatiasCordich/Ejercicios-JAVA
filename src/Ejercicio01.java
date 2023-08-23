import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        // INGRESAR 5 NUMEROS E INGRESAR SU MEDIA

        // DECLARO MIS VARIABLES
        double promedio;
        int sumaNumeros = 0;
        int numero;

        // DECLARO MI SCANNER QUE ME PERMITE TOMAR LOS VALORES POR TECLADO
        Scanner sc = new Scanner(System.in);

        // COMO TENGO QUE INGRESAR 5 VECES UN NUMERO UTILIZO UN FOR
        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese un numero: ");

            // EL VALOR QUE AGARRE EL SCANNER SERA EL VALOR DE NUMERO
            numero = sc.nextInt();

            // SUMO LOS VALORES DE LA VARIABLE NUMERO EN LA VARIABLE SUMANUMEROS
            sumaNumeros += numero;

        }

        // CALCULO EL PROMEDIO
        promedio = sumaNumeros / 5;

        // RESULTADO FINAL
        System.out.println("El promedio es de: " + promedio);

        sc.close();
    }
}
