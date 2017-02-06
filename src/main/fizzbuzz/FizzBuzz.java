package fizzbuzz;

/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{

	public long reactTo(long number) throws Exception
	{
		if (moduloEqualsZero(3 * 5, number)) { throw new FizzBuzzException();}
		if (moduloThreeEqualsZero(number)) { throw new FizzException();}
		if (moduloFiveEqualsZero(number)) {throw new BuzzException();}
		return number;
	}

	private boolean moduloEqualsZero(int modulant, long number)
	{
		return (number % modulant) == 0;
	}

	private boolean moduloThreeAndFiveEqualsZero(long number)
	{
		return moduloThreeEqualsZero(number) && moduloFiveEqualsZero(number);
	}

	private boolean moduloFiveEqualsZero(long number)

	{
		return (number % 5) == 0;
	}

	private boolean moduloThreeEqualsZero(long number)
	{
		return (number % 3) == 0;
	}
}
