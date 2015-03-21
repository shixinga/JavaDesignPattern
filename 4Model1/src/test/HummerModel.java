package test;

public abstract class HummerModel {

	public abstract void start();
	public abstract void stop();
	public abstract void emgine();
	public abstract void alarm();
	public  void run() {
		this.start();
		this.emgine();
		if(this.isAlam() == true) {
			
			this.alarm();
		}
		this.stop();
	}
	
	protected boolean isAlam() {
		return true;
	}
}
