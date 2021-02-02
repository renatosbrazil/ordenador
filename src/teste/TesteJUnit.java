package teste;
import static org.junit.Assert.*;

import org.junit.Test;

import business.Business;

public class TesteJUnit {
 
	@Test
	public void testeConfiguracao(){
		String n1 = "123";
		String n2 = "910";
		String n3 = "210";
		String n4 = "1000000000";
		
		String result1 = "321";
		String result2 = "910";
		String result3 = "210";
		String result4 = "-1";
		
		String resultadoNumero1 = Business.ordenador(n1);
		assertEquals(result1, resultadoNumero1);
		
		String resultadoNumero2 = Business.ordenador(n2);
		assertEquals(result2, resultadoNumero2);
		
		String resultadoNumero3 = Business.ordenador(n3);
		assertEquals(result3, resultadoNumero3);
		
		String resultadoNumero4 = Business.ordenador(n4);
		assertEquals(result4, resultadoNumero4);
	}
}