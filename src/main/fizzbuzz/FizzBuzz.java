package fizzbuzz;

/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{

	public long reactTo(long number) throws Exception
	{
		if (moduloThreeEqualsZero(number)) {
			throw new FizzException();
		}
		return number;
	}

	private boolean moduloThreeEqualsZero(long number)
	{
		return (number % 3) == 0;
	}
}
