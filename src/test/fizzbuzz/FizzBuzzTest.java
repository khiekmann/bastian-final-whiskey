package fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzzTest
{
	@Test
	public void test(){
		// arrange
		FizzBuzz fizz = new FizzBuzz();
		long number = 2;

		// act
		long result = fizz.reactTo(number);

		// assert
		assertEquals(result, number);
	}
}
