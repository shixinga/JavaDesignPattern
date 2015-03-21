package main;

import test.BlackHuman;
import test.BlackHumanFactory;
import test.Human;
import test.WhiteHumanFactory;
import test.YellowHumanFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Human whiteMan = new WhiteHumanFactory().createHuman();
		whiteMan.getColor();
		whiteMan.talk();
		
		Human yellowMan = new YellowHumanFactory().createHuman();
		yellowMan.getColor();
		yellowMan.talk();
		
		Human blackMan = new BlackHumanFactory().createHuman();
		blackMan.getColor();
		blackMan.talk();
	}

}
