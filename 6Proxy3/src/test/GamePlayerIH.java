package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

	Class cls = null;
	Object obj = null;
	
	public GamePlayerIH(Object obj) {
		super();
		this.obj = obj;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人盗我号！！@#@#");
		}
		return result;
	}

}
