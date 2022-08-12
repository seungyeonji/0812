
public class LambdaDemo5 {
	public static void main(String[] args) {
		Say3 say3 = new Say3() {
			@Override
			public int something(int a, int b) {
				System.out.println("Hello, World");
				System.out.println("I'm Lambda Expression");
				return a*b;
			}
		};
		Say3 lambda3 = (a, b) -> {
			System.out.println("Hello, Lambda");
			System.out.println("I'm Lambda Expression");
			return a*b;
		};
		int result = say3.something(5, 9);
		result = lambda3.something(5, 9);
		System.out.println("result = " + result);
	}
}

@FunctionalInterface
interface Say3{
	int something(int a, int b);	//return type int, parameter int 2개
}