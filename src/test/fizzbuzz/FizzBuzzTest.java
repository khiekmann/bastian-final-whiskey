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
	private long number;

	@Before
	public void before() {
		fizz = new FizzBuzz();
		result = -1L;
		number = -1L;
	}

	@Test (expected = FizzException.class)
	public void testReactionOnThreeExpectFizz() throws Exception
	{
		// arrange
		number = 3;

		// act
		result = fizz.reactTo(number);

		// assert

	}

	@Test
	public void testReactionOnTwoExpectTwo() throws Exception
	{
		// arrange
		number = 2;

		// act
		result = fizz.reactTo(number);

		// assert
		assertEquals(result, number);
	}
}
