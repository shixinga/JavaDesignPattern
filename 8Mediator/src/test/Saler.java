package test;

import java.util.Random;

public class Saler extends AbstractColeague {

	public Saler(AbstractMediator am) {
		super(am);
		// TODO Auto-generated constructor stub
	}

	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int sales = random.nextInt(100);
		System.out.println("销售情况位：" + sales);
		return sales;
	}

	public void offSale() {
		// TODO Auto-generated method stub
		this.abstractMediator.execute("saler.offSell");
	}
	
	public void sellComputer(int number) {
		this.abstractMediator.execute("saler.sell", number);
		System.out.println("销售了" + number + "台");
	}
}
