package test;

import base.Component;

//ConcreateDecoratorA 和 ConcreateDecoratorB 的父类
public class Decorator extends Component {

	protected Component component;
	@Override
	public void operation() {

		if(this.component != null) {
			this.component.operation();
		}
	}
	public void setComponent(Component component) {
		this.component = component;
	}
	
}
