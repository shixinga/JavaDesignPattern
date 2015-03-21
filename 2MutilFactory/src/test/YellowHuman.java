package test;

public class YellowHuman implements Human {

	@Override
	public void getColor() {

		System.out.println("黄种人");
	}

	@Override
	public void talk() {

		System.out.println("普通话");
	}

}
