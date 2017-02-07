package fizzbuzz;

/**
 * Created by HiekmaHe on 07.02.2017.
 */
public class FizzBuzzBuilder
{
	private final FizzBuzz fizzBuzz;

	public FizzBuzzBuilder() {
		fizzBuzz = new FizzBuzz();
		fizzBuzz.init();
	}

	public FizzBuzzBuilder add(int modulo, String message) {
		fizzBuzz.add(modulo, message);
		return this;
	}

	public FizzBuzz build()
	{
		return fizzBuzz;
	}
}
