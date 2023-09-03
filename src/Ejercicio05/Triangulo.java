package Ejercicio05;

public class Triangulo {
    public double base;
    public double altura;

    /**
     * Devuelve el area del Triangulo
     */
    public double getAreaTriangulo(){

       double area_triangulo = (this.base * this.altura)/ 2;

       return area_triangulo;
    }
}
