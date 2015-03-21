package test;

public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		this.pg.find();
		this.pg.delete();
		this.pg.plan();
	}

}
