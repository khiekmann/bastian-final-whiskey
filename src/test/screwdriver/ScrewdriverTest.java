package screwdriver;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class ScrewdriverTest
{
	private static String publicStaticMethodName;
	private static Class clazz;
	private static Class[] parameterClasses;
	private static int firstParameterValue;
	private static int secondParameterValue;
	private static Object[] parameterValues;
	int expectedResult = 3;
	private Object reflectionResult;
	private String privateMethodName;
	private Object object;
	private Screwdriver screwdriver;

	@Before
	public void before() {
		publicStaticMethodName = "publicStaticMethodAddsFirstAndSecondParameter";
		privateMethodName = "privateMethodAddsFirstAndSecondParameter";
		clazz = CatchMeIfYouCanClass.class;
		parameterClasses = new Class[]{int.class, int.class};
		firstParameterValue = 1;
		secondParameterValue = 2;
		parameterValues = new Object[] {firstParameterValue, secondParameterValue};
		object = new CatchMeIfYouCanClass();
		screwdriver = new Screwdriver();
	}

	@Test
	public void testScrewdriverCallingAPrivateMethod() throws Exception {
		// arrange

		// act
		reflectionResult = screwdriver.accessPrivateMethod(object, privateMethodName, parameterClasses, parameterValues);

		// assert
		assertEquals(expectedResult, reflectionResult);
	}

	@Test
	public void testScrewdriverCallingAPublicStaticMethod() throws Exception {
		// arrange

		// act
		reflectionResult = screwdriver.accessPublicStaticMethod(clazz, publicStaticMethodName, parameterClasses, parameterValues);

		// assert
		assertEquals(expectedResult, reflectionResult);
	}

	@Test
	public void testCallingAPublicStaticMethod() throws Exception
	{
		// arrange

		// act
		Method yesICanMethod = clazz.getMethod(publicStaticMethodName, parameterClasses);
		reflectionResult = yesICanMethod.invoke(clazz, parameterValues);

		// assert
		assertEquals(expectedResult, reflectionResult);
	}
}