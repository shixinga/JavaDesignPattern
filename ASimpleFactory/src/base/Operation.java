package base;

public abstract class Operation {

	private double numOne;
	private double numTwo;
	
	public double getNumOne() {
		return numOne;
	}

	public void setNumOne(double numOne) {
		this.numOne = numOne;
	}

	public double getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(double numTwo) {
		this.numTwo = numTwo;
	}

	public abstract double operate() throws Exception;
}
