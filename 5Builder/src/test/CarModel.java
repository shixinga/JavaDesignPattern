package test;

import java.util.ArrayList;

public abstract class CarModel {

	ArrayList<String> sequence = new ArrayList<>();
	public abstract void start();
	public abstract void stop();
	public abstract void alam();
	public abstract void emgine();
	
	public void run() {
		for(int i = 0; i < this.sequence.size(); ++i) {
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")) {
				this.start();
			} else if(actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if(actionName.equalsIgnoreCase("alam")) {
				this.alam();
			} else if(actionName.equalsIgnoreCase("emgine")) {
				this.emgine();
			}
		}
	}
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	
	
}
