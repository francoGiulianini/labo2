package testStrategy;

import org.junit.*;

import strategy.Contexto;
import strategy.EstrategiaA;
import strategy.EstrategiaB;


public class testStrategy {
		
	
	@Test
	public void testEstrategia() {
		
		
		Contexto contexto = new Contexto ();
		EstrategiaA estrategiaA = new EstrategiaA();
		EstrategiaB estrategiaB = new EstrategiaB();
		
		contexto.setEstrategia(estrategiaA);
		System.out.println(contexto.ejecutarAlgoritmo());
		contexto.setEstrategia(estrategiaB);
		System.out.println(contexto.ejecutarAlgoritmo());	
	}
	
	
		
	
	
}