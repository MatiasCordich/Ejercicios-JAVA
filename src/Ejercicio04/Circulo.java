package Ejercicio04;

public class Circulo {
    public double radio;

    public double getCircunferencia(){
        double pi = 3.141592;

        double circunferencia = 2 * pi * this.radio;

        return circunferencia;
    }
    public double getAreaCirculo(){
        double pi = 3.141592;

        double area = pi * this.radio * this.radio;

        return area;
    }
}
