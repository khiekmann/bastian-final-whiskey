package screwdriver;

import java.lang.reflect.Method;


/**
 * Created by HiekmaHe on 06.02.2017.
 */
public class Screwdriver
{
	public Object accessPublicStaticMethod(Class clazz, String publicStaticMethodName, Class[] parameterClasses, Object[] parameterValues) throws Exception
	{
		Method publicStaticMethod = clazz.getMethod(publicStaticMethodName, parameterClasses);
		return publicStaticMethod.invoke(clazz, parameterValues);
	}

	public Object accessPrivateMethod(Object object, String privateMethodName, Class[] parameterClasses, Object[] parameterValues) throws Exception {
		Method privateMethod = object.getClass().getDeclaredMethod(privateMethodName, parameterClasses);
		privateMethod.setAccessible(true);
		return privateMethod.invoke(object, parameterValues);
	}
}
