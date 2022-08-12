
public class LambdaDemo4 {
	public static void main(String[] args) {
		Say2 say2 = new Say2() {
			@Override
			public int something(int a) {
				System.out.println("Hello, World");
				System.out.println("I'm Lambda Expression");
				return a*100;
			}
		};
		Say2 lambda2 = (a) -> {
			System.out.println("Hello, Lambda");
			System.out.println("I'm Lambda Expression");
			return a*1000;
		};
		int result = say2.something(5);
		result = lambda2.something(5);
		System.out.println("result = " + result);
	}
}

@FunctionalInterface
interface Say2{
	int something(int a);	//return type int, parameter int
}