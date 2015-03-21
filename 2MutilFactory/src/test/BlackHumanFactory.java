package test;

public class BlackHumanFactory extends AbstractFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
