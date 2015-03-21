package main;

import test.Thing;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Thing thing = new Thing();
		thing.getI();
		Thing thing2 = (Thing) thing.clone();
		thing2.getI();
	}

}
