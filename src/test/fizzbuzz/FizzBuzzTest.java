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
	private Object result;
	private long number;

	@Before
	public void before() {
		fizz = new FizzBuzz();
		result = -1L;
		number = -1L;
	}

	@Test
	public void testReactionOnFifteenExpectFizzBuzz()
	{
		// arrange
		number = 15;

		// act
			result = fizz.reactTo(number);

		// assert
		assertEquals("FizzBuzz", result);
	}

	@Test
	public void testReactionOnFiveExpectBuzz()
	{
		// arrange
		number = 5;

		// act
		result = fizz.reactTo(number);

		// assert
		assertEquals("Buzz", result);
	}


	@Test
	public void testReactionOnThreeExpectFizz()
	{
		// arrange
		number = 3;

		// act
		result = fizz.reactTo(number);

		// assert
		assertEquals("Fizz", result);
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