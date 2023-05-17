package calculaprueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacionesTest {

	@Test
	public void testEsPar() {
		Operaciones operaciones = new Operaciones();
        boolean resultado = operaciones.esPar(4);
        assertEquals(true, resultado);
		
	}
		

	@Test
	public void testPromedio() {
		Operaciones operaciones = new Operaciones();
        long resultado = operaciones.promedio(10, 30, 50);
        assertEquals(30, resultado);
		
		
	}

}
