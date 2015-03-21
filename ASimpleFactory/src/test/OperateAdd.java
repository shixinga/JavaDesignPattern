package test;

import base.Operation;


public class OperateAdd extends Operation {

	@Override
	public double operate() {
		return this.getNumOne() + this.getNumTwo();
	}

}
