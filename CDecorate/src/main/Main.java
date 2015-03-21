package main;

import test.ConcreateComponent;
import test.ConcreateDecoratorA;
import test.ConcreateDecoratorB;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConcreateComponent c= new ConcreateComponent();
		
		ConcreateDecoratorA a = new ConcreateDecoratorA();
		
		ConcreateDecoratorB b = new ConcreateDecoratorB();
		
		a.setComponent(c);
		
		b.setComponent(a);
		
		b.operation();
	}

}
