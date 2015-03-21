package test;

import base.Component;

//具体对象
public class ConcreateComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的实现");
	}

}
