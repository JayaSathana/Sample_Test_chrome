package Demo_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	
	@Test
	public void sum()
	{
		int a=20;
		int b=10;
	   Assert.assertEquals(a+b, 30);
	   System.out.println("sum");
	}
	
	@Test
	public void sub()
	{
		int a=20;
		int b=10;
	   Assert.assertEquals(a-b, 10);	
	   System.out.println("sub");
	}
	
	@Test
	public void mul()
	{
		int a=20;
		int b=10;
	   Assert.assertEquals(a*b, 200);	
	   System.out.println("mul");
	}
	
	@Test
	public void Div()
	{
		int a=20;
		int b=10;
	   Assert.assertEquals(a/b, 2);	
	   System.out.println("div");
	}

}
