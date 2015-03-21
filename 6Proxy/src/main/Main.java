package main;

import test.GamePlayer;
import test.IGamePlayer;
import test.ProxyGamePlayer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IGamePlayer ip = new GamePlayer("兴爷");
		IGamePlayer ipp = new ProxyGamePlayer(ip);
		ipp.login("zhangsan", "111");
		ipp.killBoss();
		ipp.update();
	}

}
