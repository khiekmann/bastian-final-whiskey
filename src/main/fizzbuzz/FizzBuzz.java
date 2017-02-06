package fizzbuzz;

/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{

	public long reactTo(long number) throws Exception
	{
		if (moduloEqualsZero(3 * 5, number)) { throw new FizzBuzzException();}
		if (moduloEqualsZero(5, number)) {throw new BuzzException();}
		if (moduloEqualsZero(3, number)) { throw new FizzException();}
		return number;
	}

	private boolean moduloEqualsZero(int modulant, long number)
	{
		return (number % modulant) == 0;
	}
}
