package test;

public class ProxyGamePlayer implements IGamePlayer {

	private IGamePlayer igp;
	
	
	public ProxyGamePlayer(IGamePlayer igp) {
		this.igp = igp;
	}

	public void login(String name, String password) {
		// TODO Auto-generated method stub

		this.igp.login(name, password);
		
	}

	public void killBoss() {
		// TODO Auto-generated method stub

		this.igp.killBoss();
	}

	public void update() {
		// TODO Auto-generated method stub

		this.igp.update();
	}

}
