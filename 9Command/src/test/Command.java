package test;

public abstract class Command {

	RequestGroup rg = new RequestGroup();
	PageGroup pg = new PageGroup();
	CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
}
