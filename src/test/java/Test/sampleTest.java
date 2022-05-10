package Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class sampleTest {

	@Test
	public void test1()
	{
		System.out.println("Hello");
	}
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods= {"test2"})
	public void test3()
	{
		System.out.println("Not skipped");
	}
	@Test
	public void test4()
	{
		System.out.println("test four");
	}

}
