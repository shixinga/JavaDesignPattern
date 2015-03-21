package test;

public class ConcreateDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		this.bUnique();
		System.out.println("具体对象的B");
	}

	private void bUnique() {
		System.out.println("haha,b 所特有的");
	}

	
}
