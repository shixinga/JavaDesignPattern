package main;

import test.BMWModel;
import test.BenZModel;
import test.Director;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Director dir = new Director();
		BenZModel bbenz = dir.getBBenZ();
		bbenz.run();
		System.out.println("-----------");
		BMWModel abmw = dir.getABMW();
		abmw.run();
	}

}
