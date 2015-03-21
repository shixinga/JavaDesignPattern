package test;

public class BMWModel extends CarModel {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("宝马要开动啦！！！");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马一下子停下来");

	}

	@Override
	public void alam() {
		// TODO Auto-generated method stub
		System.out.println("宝马闹钟响了");

	}

	@Override
	public void emgine() {
		// TODO Auto-generated method stub
		System.out.println("宝马引擎轰轰响");

	}

}
