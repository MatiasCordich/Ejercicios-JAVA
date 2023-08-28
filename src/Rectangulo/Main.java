package Rectangulo;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangulo rec1;

        rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo();

        rec1.base = 2;
        rec1.altura = 5;

        rec2.base = 6;
        rec2.altura = 4;

        System.out.println("Rectangulo 1");
        System.out.println("Base: " + rec1.base);
        System.out.println(rec1.area());
        System.out.println(rec1.perimetro());
    }
}
