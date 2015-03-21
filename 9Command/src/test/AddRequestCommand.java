package test;

public class AddRequestCommand extends Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		this.rg.find();
		this.rg.add();
		this.rg.plan();
	}

}
