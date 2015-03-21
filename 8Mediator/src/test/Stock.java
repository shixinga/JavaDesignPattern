package test;

public class Stock extends AbstractColeague {

	private static int NUMBERS = 100;
	public Stock(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}

	public void increase(int number) {
		this.NUMBERS += number;
	}

	public int getStockNumber() {
		// TODO Auto-generated method stub
		return NUMBERS;
	}

	public void decrease(int object) {
		// TODO Auto-generated method stub
		this.NUMBERS -= object;
	}
	
	public void clearStock() {
		System.out.println("清理存货数量为：" + NUMBERS);
		this.abstractMediator.execute("stock.clearStock");
	}
}
