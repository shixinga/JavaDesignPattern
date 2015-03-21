package test;

import base.Base;

public class Context {

	//依赖关系
	private Base abc;

	public Context(Base base) {
		this.abc = base;
	}
	
	//该构造函数是strategy和simpleFactory两种模式的结合
	public Context(String type) {
		switch(type) {
		case "A":
			this.abc = new A();
			break;
		case "B": 
			this.abc = new B();
			break;
		case "C":
			this.abc = new C();
			break;
		}
	}
	
	
	public void method() {
		abc.base();
	}

	
}
