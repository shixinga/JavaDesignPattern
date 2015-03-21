package test;

public class Facther extends AbstractHandle {



	public Facther() {
		super(AbstractHandle.FATHER_LEVEL_REQUEST);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub

		System.out.println("----------女儿向父亲请示---------");
		System.out.println(women.getRequest());
		System.out.println("父亲的回答是：同意");
		
	}

}
