package calculaprueba;

public class Calculadora {
	 
	public int sumar(int a, int b) {
        return a + b;
    }
	    
	public int restar(int a, int b) {
        return a - b;
    }
	    
	public int multiplicar(int a, int b) {
        return a * b;
    }
    
	public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return (double) a / b;
    }
	
	public double cuadradoNum(int a) {
		double cuadrado = Math.pow(a, 2);
        return cuadrado;
    }
	
	public double cuboNum(int a) {
		double cuadrado = Math.pow(a, 3);
        return cuadrado;
    }
}
