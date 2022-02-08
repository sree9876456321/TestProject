package greatestNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumbersTest {
	int num1=-1,num2=-2,num3=0,num4=-3;
	Numbers1 num = new Numbers1(num1, num2, num3, num4);
	@Test
	public void GreatestFour() {
		assertEquals(0,num.GreatestFour());
	}
}
