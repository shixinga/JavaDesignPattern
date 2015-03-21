package test;

import base.Operation;

public class OperationDev extends Operation {

	@Override
	public double operate() throws Exception {
		if(this.getNumTwo() != 0) {
			return this.getNumOne() / this.getNumTwo();
		} else {
			throw new Exception("除数不能为0");
		}
	}

}
