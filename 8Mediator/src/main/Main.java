package main;

import test.AbstractMediator;
import test.Buyer;
import test.Mediator;
import test.Saler;
import test.Stock;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractMediator am = new Mediator();
		System.out.println("采购员采购电脑-------------");
		Buyer buyer = new Buyer(am);
		buyer.butComputer(100);
		System.out.println("销售员销售电脑--------========");
		Saler sale = new Saler(am);
		sale.sellComputer(2);
		System.out.println("库房管理员清库处理===============");
		Stock stock = new Stock(am);
		stock.clearStock();
	}

}
