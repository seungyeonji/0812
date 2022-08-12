
public class LambdaDemo1 {
	public static void main(String[] args) {
		LambdaDemo1 Ld = new LambdaDemo1();
		//1st way
		//YourClass yc = Ld.new YourClass();
		//Ld.exec(yc);
		
		
		//2nd way : anonymous class
//		Ld.exec(new YourInterface() {
//			@Override
//			public int compare(int a, int b) {
//				return a-b;
//			}
//		});
		
		//3rd way : lambda
		Ld.exec((a, b) -> a-b);
	}
	void exec(YourInterface yi) {
		int result = yi.compare(5, 9);
		System.out.println(result);
	}
	
//	class YourClass implements YourInterface{
//		@Override
//		public int compare(int a, int b) {
//			return a - b;
//		}
//	}
}
