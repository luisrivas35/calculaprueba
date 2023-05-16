package calculaprueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraFinancieraTest {


	public void testCalcularInteresSimple1() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularInteresSimple(1000, 0.05, 2);
        assertEquals(100.0, resultado, 0.01);
    }
    
    @Test
    public void testCalcularInteresCompuesto1() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularInteresCompuesto(1000, 0.05, 2);
        assertEquals(1102.5, resultado, 0.01);
    }
	
	
	
	

}
