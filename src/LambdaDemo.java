/*
 * 1. 원래 Lambda는 Scala나 Groovy에서 사용하기 위해 만든 익명메소드
 * 2. Java는 1.8 버전에서 함수형 언어를 구현하기 위해 도입
 */
public class LambdaDemo {
	public static void main(String[] args) {
		//익명객체 사용
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a + b;
//			}
//		};
		
		
		//lambda 표현식
		MyInterface mi = (a,b) -> a+b;	
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
		
		mi = (a,b) -> a*b;
		result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
		
		mi = (a,b) -> a-b;
		result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}
}

@FunctionalInterface //이 인터페이스는 메소드가 하나임을 보장하며, 따라서 향후 람다에서 쓸수 있다는걸 알려줌
interface MyInterface{
	int calculate(int a, int b);
}
