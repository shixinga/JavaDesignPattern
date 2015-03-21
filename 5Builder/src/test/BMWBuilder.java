package test;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	private BMWModel bm = new BMWModel();
	@Override
	public void setSquence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bm.setSequence(sequence);
	}

	@Override
	public CarModel getModel() {
		// TODO Auto-generated method stub
		return bm;
	}

}
