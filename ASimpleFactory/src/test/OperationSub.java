package test;

import base.Operation;

public class OperationSub extends Operation {

	@Override
	public double operate() {
		return this.getNumOne() - this.getNumTwo();
	}

}
