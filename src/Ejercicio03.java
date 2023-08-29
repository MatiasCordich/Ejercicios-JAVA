import java.util.Scanner;

public class Ejercicio03 {

    // DE 10 NUMEROS INGRESADOS, INDICAR CUANTOS SON MAYORES A CERO Y CUANTOS SON
    // MENORES A CERO

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int contador_mayores = 0;
        int contador_menores = 0;
        float numero;

        while (contador < 10) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextFloat();

            if (numero > 0) {
                contador_mayores += 1;
            } else {
                contador_menores += 1;
            }

            contador++;
        }

        System.out.println("La cantidad de numeros mayores a 0 ingresados son: " + contador_mayores);
        System.out.println("La cantidad de numeros menores a 0 ingresados son: " + contador_menores);

        sc.close();
    }

}
