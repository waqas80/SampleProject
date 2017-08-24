
public class HelloWorld implements IHelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello world. This is my first Git project");
	}

	@Override
	public void InterfacePrint() {
		System.out.println("Print statement from Interface method");
	}

}
