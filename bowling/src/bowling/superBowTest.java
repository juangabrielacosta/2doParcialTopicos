package bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class superBowTest {
public superBow bowling;
//	@Test
//	public void testTirar(int x,int y,superBow bowling) {
//		fail();
//	}
	@Before
	public void setUp()
	{
		this.bowling= new superBow();
		
	}
void tirarTodo (int a ,int b , superBow bowling) {
	for (int i= 0 ; i< a ;i++)
		bowling.tirar(b);
	
}


@Test
public void testPuntos() {
	bowling.tirar(10);
	bowling.tirar(3);
	tirarTodo(16, 0, bowling);
	assertEquals(16, bowling.puntos());
}

	@Test
	public void juegoPerfecto() {
		tirarTodo(12, 10, bowling);
		assertEquals(300, bowling.puntos());
	}
	@Test
	public void testNulo() {
		tirarTodo(20, 0, bowling);
		assertEquals(0, bowling.puntos());
	}
	

//	@Test
//	public void testExtra() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testStrikeBonus() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testExtraBonus() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAgregoElemento() {
//		fail("Not yet implemented");
//	}

}
