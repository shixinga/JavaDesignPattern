package test;

public class WhiteHumanFactory extends AbstractFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
