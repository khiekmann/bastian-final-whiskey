package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{
	private LinkedList<ModuloAndMessage> moduloAndMessagePairs;

	public FizzBuzz() {
		moduloAndMessagePairs = new LinkedList<>();
		moduloAndMessagePairs.add(new ModuloAndMessage(3, "Fizz"));
		moduloAndMessagePairs.add(new ModuloAndMessage(5, "Buzz"));
	}

	public Object reactTo(long number)
	{
		Object reaction = updateReactionUsingModulos(number);
		reaction = ifReactionIsNullSetTo(reaction, number);
		return reaction;
	}

	private Object ifReactionIsNullSetTo(Object reaction, long number)
	{
		if (reaction.equals("")) {
			reaction = number;
		}
		return reaction;
	}

	private Object updateReactionUsingModulos(long number)
	{
//   	/*
		Object reaction = "";
//				/*
		for (ModuloAndMessage pair : moduloAndMessagePairs) {
			if(moduloEqualsZero(pair.getModulo(), number)) {reaction = reaction + pair.getMessage();}
		}
		//		*/
/*
		if (moduloEqualsZero(3 * 5, number)) { reaction = "FizzBuzz";}
		else if (moduloEqualsZero(5, number)) { reaction = "Buzz";}
		else if (moduloEqualsZero(3, number)) { reaction = "Fizz";}
//		 */
		return reaction;
	}

	private boolean moduloEqualsZero(int modulant, long number)
	{
		return (number % modulant) == 0;
	}
}
