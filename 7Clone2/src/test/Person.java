package test;

import java.util.ArrayList;

public class Person implements Cloneable {

	private ArrayList<String> arr = new ArrayList<>();

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person = null;
		person =  (Person) super.clone();
		//xia mian shi shen copy
		person.arr = (ArrayList<String>) this.arr.clone();
		
		return person;
		
	}
	
	public void setValue(String va) {
		this.arr.add(va);
	}
	
	public void getValue() {
		System.out.println(this.arr);
	}
	
}
