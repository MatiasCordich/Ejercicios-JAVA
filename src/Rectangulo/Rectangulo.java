package Rectangulo;

public class Rectangulo {
    
    //------Atributos------
	public double base;
	public double altura;
	public String color;

	//------Metodos--------
	public double area(){
		return base * altura;
	}
	public double perimetro() {
		return 2 * (base + altura);
	}
}
