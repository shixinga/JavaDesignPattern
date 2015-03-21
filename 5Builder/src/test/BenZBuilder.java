package test;

import java.util.ArrayList;

public class BenZBuilder extends CarBuilder {

	private BenZModel bm = new BenZModel();
	@Override
	public void setSquence(ArrayList<String> sequence) {

		this.bm.setSequence(sequence);
	}

	@Override
	public CarModel getModel() {
		// TODO Auto-generated method stub
		return bm;
	}

}
