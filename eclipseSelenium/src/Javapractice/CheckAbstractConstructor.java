package Javapractice;

public class CheckAbstractConstructor extends ConstructorCalling{
	public static void main(String[] args) {
		CheckAbstractConstructor rv = new CheckAbstractConstructor();
		System.out.println(rv);
	}
	public CheckAbstractConstructor() {
		System.out.println("hello");
	}

}
