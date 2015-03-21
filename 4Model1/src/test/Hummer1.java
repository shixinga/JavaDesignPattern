package test;

public class Hummer1 extends HummerModel {

	private boolean alam;
	public void setAlam(boolean alam) {
		this.alam = alam;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("悍马1开始");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

		System.out.println("悍马1停止");
	}

	@Override
	public void emgine() {
		// TODO Auto-generated method stub
		System.out.println("悍马1发动引擎");

	}

	@Override
	public void alarm() {
		System.out.println("悍马1滴滴滴滴");

	}

	@Override
	protected boolean isAlam() {
		// TODO Auto-generated method stub
		return this.alam;
	}

	
}
