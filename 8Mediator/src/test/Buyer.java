package test;

public class Buyer extends AbstractColeague {

	public Buyer(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}

	public void butComputer(int number) {
		this.abstractMediator.execute("buyer.buy", number);
	}

	public void refuseBuyComputer() {
		// TODO Auto-generated method stub
		System.out.println("不要在购置computer了");
	}
}
