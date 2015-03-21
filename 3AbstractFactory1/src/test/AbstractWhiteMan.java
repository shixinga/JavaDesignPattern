package test;

public abstract class AbstractWhiteMan implements Human {

	@Override
	public void getColor() {

		System.out.println("白种人");
	}

	@Override
	public void talk() {

		System.out.println("百种人说english");
	}

}
