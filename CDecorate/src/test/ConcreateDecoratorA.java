package test;

public class ConcreateDecoratorA extends Decorator {

	//ConcreateDecoractorA的独有的功能，用于区别于其他类（即ConcreateDecoratorB）
	private String addState;
	@Override
	public void operation() {
		super.operation();
		this.addState = "new state";
		System.out.println("具体修饰的对象 A");
	}

	
}
