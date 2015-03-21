package test;

public class Husband extends AbstractHandle {

	public Husband() {
		super(AbstractHandle.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub

		System.out.println("-----妻子向丈夫请求");
		System.out.println(women.getRequest());
		System.out.println("丈夫同意");
	}

}
