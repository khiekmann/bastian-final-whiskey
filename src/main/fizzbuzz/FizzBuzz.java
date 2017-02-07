package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{
	private LinkedList<Integer> modulos;

	public FizzBuzz() {
		modulos = new LinkedList<>();
		modulos.add(3);
		modulos.add(5);
		modulos.add(15);
	}

	public Object reactTo(long number)
	{
		Object reaction = updateReactionUsingModulos(number);
		reaction = ifReactionIsNullSetTo(reaction, number);
		return reaction;
	}

	private Object ifReactionIsNullSetTo(Object reaction, long number)
	{
		System.out.println(":" + reaction + ":");
		if (reaction == null) {
			reaction = number;
		}
		return reaction;
	}

	private Object updateReactionUsingModulos(long number)
	{
		/*
		for (Integer modulo : modulos) {
			reaction = reaction + "" + moduloEqualsZero(modulo, number);
		}
		*/
//   	/*
		Object reaction = null;
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
