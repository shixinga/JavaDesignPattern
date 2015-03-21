package test;

import base.Operation;

public class OperationMul extends Operation {

	@Override
	public double operate() {
		return this.getNumOne() * this.getNumTwo();
	}

}
