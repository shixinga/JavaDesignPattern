package test;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowMan();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new FemalWhiteMan();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new FemaleBlackMan();
	}

}
