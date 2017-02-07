package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class FizzBuzz
{
	private LinkedList<ModuloAndReactionPair> moduloAndReactionPairs;

	public FizzBuzz() {
		moduloAndReactionPairs = new LinkedList<>();
	}

	public boolean add(int modulo, String message) {
		return moduloAndReactionPairs.add(new ModuloAndReactionPair(modulo, message));
	}

	public Object reactTo(long number)
	{
		return returnReactionOrReplacementIfEmpty(getReactionOrEmpty(number), number);
	}

	private Object returnReactionOrReplacementIfEmpty(Object reaction, long replaceEmptyReaction)
	{
		return isReactionEmpty(reaction) ? replaceEmptyReaction : reaction;
	}

	private boolean isReactionEmpty(Object reaction)
	{
		return reaction.toString().isEmpty();
	}

	private Object getReactionOrEmpty(long number)
	{
		StringBuilder reactionBuilder = new StringBuilder();
		for (ModuloAndReactionPair pair : moduloAndReactionPairs) { reactionBuilder.append(reactIfModuloEqualsZero(pair, number));}
		return reactionBuilder.toString();
	}

	public Object reactIfModuloEqualsZero(ModuloAndReactionPair pair, long number)
	{
		return (moduloEqualsZero(pair.getModulo(), number)) ? pair.getMessage() : "";
	}

	private boolean moduloEqualsZero(int modulant, long number)
	{
		return (number % modulant) == 0;
	}
}
