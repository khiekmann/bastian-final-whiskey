package fizzbuzz;

import java.util.LinkedList;

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
	private String expectedResultsFromOneToHundred = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz]";

	@Before
	public void before() {
		fizz = new FizzBuzzBuilder()
				.add(3, "Fizz")
				.add(5, "Buzz")
				.build();
		result = -1L;
		number = -1L;
	}

	@Test
	public void testReactionFromOneToHundred()
	{
		// arrange
		LinkedList<Object> results = new LinkedList<>();

		// act
		for ( int i = 1; i < 101; i++) {
			results.add(fizz.reactTo(i));
		}

		// assert
		assertEquals(expectedResultsFromOneToHundred, results.toString());
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
		assertEquals(number, result);
	}
}