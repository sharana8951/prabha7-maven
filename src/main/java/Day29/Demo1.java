package Day29;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	
	@BeforeMethod
	public void test()
	{
		Reporter.log("BM",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("sharana",true);
	}
	
	@BeforeMethod
	public void test2()
	{
		Reporter.log("AM",true);
	}
}
