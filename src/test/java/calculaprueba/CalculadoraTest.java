package calculaprueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 2);
        assertEquals(3, resultado);
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 2);
        assertEquals(8, resultado);
    }
    
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado, 0.01);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
    }
    
  //@Test
    //public void testCuadradoNum() {
	//    Calculadora calculadora = new Calculadora();
	//    double resultado = calculadora.cuadradoNum(4);
	//    assertEquals(16, resultado);
	//}
			
	//@Test
	//public void testCuboNum() {
	//    Calculadora calculadora = new Calculadora();
	//    double resultado = calculadora.cuboNum(9);
	//    assertEquals(729, resultado);
	//}
   
}
