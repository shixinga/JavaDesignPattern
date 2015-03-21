package main;

import test.FemaleBlackMan;
import test.FemaleFactory;
import test.Human;
import test.HumanFactory;
import test.MaleFactory;
import test.MaleWhiteMan;
import test.MaleYellowMan;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanFactory mf = new MaleFactory();
		HumanFactory ff = new FemaleFactory();
		
		Human my = mf.createYellowHuman();
		my.getColor();
		((MaleYellowMan)my).getSex();
		
		Human fb = ff.createBlackHuman();
		fb.talk();
		((FemaleBlackMan)fb).getSex();
	}

}
