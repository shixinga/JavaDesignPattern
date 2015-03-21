package test;

public class GamePlayer implements IGamePlayer {

	private String name;
	
	
	public GamePlayer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void login(String name) {

		System.out.println(name + "登陆成功");
	}

	@Override
	public void killBoss() {

		System.out.println(this.name + "杀了boss");
	}

	@Override
	public void update() {
		System.out.println(this.name + "升级了！！！");

	}

}
