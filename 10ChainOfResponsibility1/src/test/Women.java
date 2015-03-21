package test;

public class Women implements IWomen {

	private int type;
	private String request;
	
	
	public Women(int type, String request) {
		this.type = type;
		switch (type) {
		case AbstractHandle.FATHER_LEVEL_REQUEST:
			this.request = "对老爸的请求:" + request;
			break;
		case AbstractHandle.HUSBAND_LEVEL_REQUEST:
			this.request = "对老公的请求:" + request;
			break;
		case AbstractHandle.SON_LEVEL_REQUEST:
			this.request = "对儿子的请求:" + request;
			break;

		default:
			break;
		}		
		
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
