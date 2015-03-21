package test;

public abstract class AbstractMediator {

	protected Buyer buyer;
	protected Saler saler;
	protected Stock stock;
	public AbstractMediator() {
		this.buyer = new Buyer(this);
		this.saler = new Saler(this);
		this.stock = new Stock(this);
	}
	
	public abstract void execute(String str, Object ... objects);
	
	
}
