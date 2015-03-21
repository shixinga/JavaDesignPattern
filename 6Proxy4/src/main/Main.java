package main;

import java.lang.reflect.InvocationHandler;

import test.DynamicProxy;
import test.MyInvocationHandler;
import test.RealSubject;
import test.Subject;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = new RealSubject();
		InvocationHandler handle = new MyInvocationHandler(subject);
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handle);
		proxy.dosomething("finish");
		
	}

	
}
