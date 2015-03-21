package test;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	
	public GamePlayer(IGamePlayer ip, String name) throws Exception {
		if(ip == null) {
			throw new Exception("代理不能为空");
		} 
		this.name = name;
	}

	public void login(String name, String password) {
		// TODO Auto-generated method stub

		System.out.println("登录名为" + name + "的用户登陆成功");
	}

	public void killBoss() {
		// TODO Auto-generated method stub

		System.out.println(this.name + "扫怪了");
	}

	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "升级了吧");

	}

}
