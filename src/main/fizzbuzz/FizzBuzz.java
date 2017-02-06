package fizzbuzz;

/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{

	public Object reactTo(long number)
	{
		Object reaction = number;
		if (moduloEqualsZero(3 * 5, number)) { reaction = "FizzBuzz";}
		else if (moduloEqualsZero(5, number)) { reaction = "Buzz";}
		else if (moduloEqualsZero(3, number)) { reaction = "Fizz";}
		return reaction;
	}

	private boolean moduloEqualsZero(int modulant, long number)
	{
		return (number % modulant) == 0;
	}
}
