package main;

import test.A;
import test.B;
import test.C;
import test.Context;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Context con = new Context(new A());
		con.method();
		con = new Context(new B());
		con.method();
		con = new Context(new C());
		con.method();
		System.out.println();
		
		//strategy 和 simpleFactory 两种模式的结合
		Context con2 = new Context("A");
		con2.method();
		con2 = new Context("B");
		con2.method();
		con2 = new Context("C");
		con2.method();
	}

}
