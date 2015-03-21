package main;

import java.util.ArrayList;
import java.util.Random;

import test.Facther;
import test.Husband;
import test.IWomen;
import test.Son;
import test.Women;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		ArrayList<IWomen> list = new ArrayList<>();
		for(int i = 0; i < 5; ++i) {
			list.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}
		
		Facther father = new Facther();
		Husband husband = new Husband();
		Son son = new Son();
		father.setNext(husband);
		husband.setNext(son);
		
		for(IWomen women : list) {
			father.HandleMessage(women);
		}
	}

}
