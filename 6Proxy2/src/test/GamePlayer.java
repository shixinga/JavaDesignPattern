package test;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	private ProxyGamePlayer pp; 
	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub

		if(this.isProxy() == false) {
			System.out.println("请找我的代理谈话");
		} else {
			System.out.println(name + "登陆成功");
		}
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		if(this.isProxy() == false) {
			System.out.println("请找我的代理谈话");
		} else {
			System.out.println(this.name + "杀怪了！！！");
		}

	}

	public void update() {
		if(this.isProxy() == false) {
			System.out.println("请找我的代理谈话");
		} else {
			System.out.println(this.name + "上升级");
		}
	}
	
	@Override
	public IGamePlayer getProxy() {
		this.pp = new ProxyGamePlayer(this);
		return this.pp;
	}

	private boolean isProxy() {
		if(this.pp == null) {
			return false;
		} else {
			return true;
		}
	}
}
