package test;

public class ProxyGamePlayer implements IGamePlayer {

	private GamePlayer gp;
	
	
	public ProxyGamePlayer(GamePlayer gp) {
		this.gp = gp;
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub

		this.gp.login(name, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub

		this.gp.killBoss();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		this.gp.update();
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return this;
	}

}
