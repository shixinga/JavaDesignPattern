package test;


public abstract class AbstractHandle {

	public static final int FATHER_LEVEL_REQUEST = 1;
	public static final int HUSBAND_LEVEL_REQUEST = 2;
	public static final int SON_LEVEL_REQUEST = 3;
	private int level = 0;
	private AbstractHandle nextHandle = null;
	
	public AbstractHandle(int level) {
		this.level = level;
	}
	public final void HandleMessage(IWomen women) {
		if(this.level == women.getType()) {
			this.response(women);
		} else {
			if(this.nextHandle != null) {
				this.nextHandle.HandleMessage(women);
			} else {
				System.out.println("---没地方请示了，按不同意处理----");
			}
		}
	}
	public void setNext(AbstractHandle nextHandle) {
		this.nextHandle = nextHandle;
	}
	protected abstract void response(IWomen women);
}
