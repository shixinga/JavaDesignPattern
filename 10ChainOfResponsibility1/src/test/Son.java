package test;

public class Son extends AbstractHandle {

	public Son() {
		super(AbstractHandle.SON_LEVEL_REQUEST);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub

		System.out.println("----老妈向儿子请示");
		System.out.println(women.getRequest());
		System.out.println("儿子同意");
	}

}
