package main;

import test.AddRequestCommand;
import test.DeletePageCommand;
import test.Invoker;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoker invoke = new Invoker();
		invoke.setCommand(new DeletePageCommand());
		invoke.action();
		
		invoke.setCommand(new AddRequestCommand());
		invoke.action();
	}

}
