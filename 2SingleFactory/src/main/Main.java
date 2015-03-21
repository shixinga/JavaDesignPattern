package main;

import test.BlackHuman;
import test.Human;
import test.HumanFactory;
import test.WhiteHuman;
import test.YellowHuman;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Human yellowMan = HumanFactory.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
		
		Human whiteMan = HumanFactory.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();
		
		Human blackMan = HumanFactory.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();
	}

}
