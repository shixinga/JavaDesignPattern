package main;

import test.IGamePlayer;
import test.ProxyGamePlayer;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		IGamePlayer ipp = new ProxyGamePlayer("仕兴");
		ipp.login("兴爷", "123");
		ipp.killBoss();
		ipp.upgrade();
	}

}
