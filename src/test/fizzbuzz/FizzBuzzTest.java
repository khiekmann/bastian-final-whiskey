package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzzTest
{
	private FizzBuzz fizz;
	private long result;

	@Before
	public void before() {
		fizz = new FizzBuzz();
		result = -1L;
	}


	@Test
	public void testReactionOnTwoExpectTwo(){
		// arrange
		long number = 2;

		// act
		result = fizz.reactTo(number);

		// assert
		assertEquals(result, number);
	}
}
