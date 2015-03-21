package main;

import test.Singleton;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int day = 0; day < 3; ++day) {
			Singleton st = Singleton.getInstance();
			st.say();
			System.out.println(st.hashCode());
		}

	}

}
