package test;

public class PageGroup extends Group {

	@Override
	public void find() {
		// TODO Auto-generated method stub

		System.out.println("美工给我来");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

		System.out.println("美工给我增加一个页面");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("美工给我删除一个页面");

	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("美工给我变化一个页面");

	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub

		System.out.println("客户要求你又变幻页面的计划");
	}

}
