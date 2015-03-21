package test;

public class ProxyGamePlayer implements IGamePlayer {

	private GamePlayer gp;
	
	
	public ProxyGamePlayer(String name) throws Exception {
		this.gp = new GamePlayer(this, name);
	}

	public void login(String name, String password) {
		// TODO Auto-generated method stub

		this.gp.login(name, password);
	}

	public void killBoss() {
		// TODO Auto-generated method stub

		this.gp.killBoss();
	}

	public void upgrade() {
		// TODO Auto-generated method stub

		this.gp.upgrade();
	}

}
