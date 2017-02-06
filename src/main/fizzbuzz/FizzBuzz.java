package fizzbuzz;

/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{

	public long reactTo(long number) throws Exception
	{
		if (moduloThreeEqualsZero(number)) { throw new FizzException();}
		if (moduloFiveEqualsZero(number)) {throw new BuzzException();}
		return number;
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
