package greatestNumber;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestngTest {
	int num1=10,num2=20,num3=30,num4=40;
	Testng tg = new Testng(num1, num2, num3, num4);
	
	@Test
	public void GreatestFour() {
		Assert.assertEquals(40,tg.GreatestFour());
	}
}
