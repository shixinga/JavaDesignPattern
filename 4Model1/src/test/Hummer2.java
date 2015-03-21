package test;

public class Hummer2 extends HummerModel {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("悍马2开始");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("悍马2停止");

	}

	@Override
	public void emgine() {
		// TODO Auto-generated method stub
		System.out.println("悍马2启动了！！！");

	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("悍马2嘟嘟嘟嘟");

	}

	@Override
	protected boolean isAlam() {
		return false;
	}
	
	

}
