package test;

import base.Operation;

public class OperationFactory {

	public static Operation createOperation(String ope) {
		Operation operation = null;
		switch(ope) {
		case "+" : 
			operation = new OperateAdd();
			break;
		case "-" :
			operation = new OperationSub();
			break;
		case "*" :
			operation = new OperationMul();
			break;
		case "/" :
			operation = new OperationSub();
			break;
		}
		
		return operation;
	}
}
