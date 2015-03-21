package test;

public class GamePlayer implements IGamePlayer {

	String name = "";
	
	
	public GamePlayer(String name) {
		this.name = name;
	}

	public void login(String name, String password) {
		// TODO Auto-generated method stub

		System.out.println("登录名为:" + name + "的用户登录成功");
	}

	public void killBoss() {
		// TODO Auto-generated method stub

		System.out.println(this.name + "杀boss");
	}

	public void update() {
		// TODO Auto-generated method stub

		System.out.println(this.name + "升级了！！！！");
	}

}
