package Circulo;

public class Circulo {
    public double radio;
		
	public double diametro(){
		return radio*2;
	}
	
	public double area(){
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double perimetro(){
		return Math.PI * radio * 2;
	}
}
