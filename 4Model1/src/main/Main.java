package main;

import test.Hummer1;
import test.Hummer2;
import test.HummerModel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hummer1 hm = new Hummer1();
//		hm.setAlam(true);
		hm.run();
		
		Hummer2 h2 = new Hummer2();
		h2.run();
	}

}
