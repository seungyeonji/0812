
public class LambdaDemo3 {
	public static void main(String[] args) {
		Say1 say1 = new Say1() {
			@Override
			public int something() {
				System.out.println("Hello, World");
				System.out.println("I'm Lambda Expression");
				return 100;
			}
		};
		Say1 lambda1 = () -> {
			System.out.println("Hello, Lambda");
			System.out.println("I'm Lambda Expression");
			return 1000;
		};
		int result = say1.something();
		result = lambda1.something();
		System.out.println("result = " + result);
	}
}

@FunctionalInterface
interface Say1{
	int something();	//return type int, parameter Nothing
}