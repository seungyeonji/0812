/*
 * lambda 주의사항
 * lambda가 접근하고자 하는 메소드는 하나여야 한다
 */

@FunctionalInterface	//메소드가 하나임을 보장
public interface YourInterface {
	int compare(int a, int b);
}
