package test;

public class Thing implements Cloneable {

	private int i = 0;

	public Thing() {
		i++;
		System.out.println("构造函数被执行力！！！" + i);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Thing thing = null;
		
		thing =  (Thing) super.clone();
		return thing;
	}
	
	
	public void getI() {
		System.out.println("i=" + i);
	}
	
	
}
