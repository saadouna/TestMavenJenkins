package parcours;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Az {

	@Test
	public void add()
	{
		System.out.println("---add---");
		int a =2;
		int b=3;
		assertEquals(5, a+b);
	}
	
	@Test
	public void Moins()
	{
		System.out.println("---Moins---");
		int a =2;
		int b=3;
		assertEquals(-1, a-b);
	}
	
	@Test
	public void Mul()
	{
		System.out.println("---Mul---");
		int a =2;
		int b=3;
		assertEquals(6, a*b);
	}
}
