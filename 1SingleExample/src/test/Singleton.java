package test;

public class Singleton {

	private static Singleton sigleton = new Singleton();

	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		return sigleton;
	}
	
	public static void say() {
		System.out.print("我就是哪个皇帝,,,,");
	}
}
