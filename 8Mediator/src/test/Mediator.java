package test;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("buyer.buy")) {
			this.buyComputor((int) objects[0]);
		} else if(str.equals("saler.sell")) {
			this.sellComputor((int) objects[0]);
		} else if(str.equals("saler.offSell")) {
			this.offSell();
		} else if(str.equals("stock.clearStock")) {
			this.clearStock();
		}

	}
	
	

	private void clearStock() {
		// TODO Auto-generated method stub
		this.saler.offSale();
		this.buyer.refuseBuyComputer();
	}



	private void offSell() {
		// TODO Auto-generated method stub
		System.out.println("折价销售：" + this.stock.getStockNumber());
	}

	private void sellComputor(int object) {
		// TODO Auto-generated method stub
		if(this.stock.getStockNumber() < object) {
			this.buyer.butComputer(object);
		}
		this.stock.decrease(object);
	}

	private void buyComputor(int number) {
		// TODO Auto-generated method stub
		int sales = this.saler.getSaleStatus();
		if(sales > 80) {
			System.out.println("购置了：" + number);
			this.stock.increase(sales);
		} else {
			number = number / 2;
			System.out.println("销售情况不好，，折半购置了：" + number);
			this.stock.increase(number);
		}
	}

}
