
public class LambdaDemo2 {
	public static void main(String[] args) {
		Say say = new Say() {
			@Override
			public void something() {
				System.out.println("Hello, World");
				System.out.println("I'm Lambda Expression");
			}
		};
		Say lambda = () -> {
			System.out.println("Hello, Lambda");
			System.out.println("I'm Lambda Expression");
		};
		say.something();
		lambda.something();
	}
}

@FunctionalInterface
interface Say{
	void something();	//return type Nothing, parameter Nothing
}