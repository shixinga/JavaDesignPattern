package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import test.GamePlayer;
import test.GamePlayerIH;
import test.IGamePlayer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IGamePlayer player = new GamePlayer("仕兴");
		InvocationHandler handler = new GamePlayerIH(player);
		ClassLoader cl = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		proxy.login("xingye");
		proxy.killBoss();
		proxy.update();
		
	}

}
