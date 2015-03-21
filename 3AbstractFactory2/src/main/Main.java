package main;

import test.AbstractFactory;
import test.AbstractProductA;
import test.AbstractProductB;
import test.Product1Factory;
import test.Product2Factory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractFactory p1 = new Product1Factory();
		AbstractProductA aa;
		AbstractProductB ab;
		aa = p1.createProductA();
		ab = p1.createProductB();
		aa.product();
		ab.product();
		AbstractFactory p2 = new Product2Factory();
		aa = p2.createProductA();
		ab = p2.createProductB();
		aa.product();
		ab.product();
	}

}
