package main;

import test.Person;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.setValue("zhang3");
		Person clonePerson = (Person) p.clone();
		clonePerson.setValue("li4");
		
		p.getValue();
		
		clonePerson.getValue();
	}

}
