package main;

import test.GamePlayer;
import test.IGamePlayer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GamePlayer gp = new GamePlayer("兴爷");
		gp.login("xingye", "12");
		gp.killBoss();
		gp.update(); 
		System.out.println("============");
		
		IGamePlayer pp = gp.getProxy();
		pp.login("shixing", "11");
		pp.killBoss();
		pp.update();
	}

}
