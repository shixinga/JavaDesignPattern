package main;

import test.AbstractHumanFactory;
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

		AbstractHumanFactory af = new HumanFactory();
		Human whiteMan = af.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();
		
		Human yellowMan = af.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
		
		Human blackMan = af.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();
	}

}
