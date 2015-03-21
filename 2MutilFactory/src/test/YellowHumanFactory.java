package test;

public class YellowHumanFactory extends AbstractFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
