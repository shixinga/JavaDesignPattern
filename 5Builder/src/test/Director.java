package test;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequence = new ArrayList<>();
	private BMWBuilder bmw = new BMWBuilder();
	private BenZBuilder benz = new BenZBuilder();
	
	public BMWModel getABMW() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmw.setSquence(sequence);
		return (BMWModel) bmw.getModel();
	}
	public BMWModel getBBMW() {
		this.sequence.clear();
		this.sequence.add("emgine");
		this.sequence.add("alam");
		this.bmw.setSquence(sequence);
		return (BMWModel) bmw.getModel();
	}
	
	public BenZModel getABenZ() {
		this.sequence.clear();
		this.sequence.add("alam");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benz.setSquence(sequence);
		return (BenZModel) benz.getModel();
	}
	public BenZModel getBBenZ() {
		this.sequence.clear();
		this.sequence.add("stop");
		this.sequence.add("alam");
		this.sequence.add("emgine");
		this.benz.setSquence(sequence);
		return (BenZModel) benz.getModel();
	}
}
