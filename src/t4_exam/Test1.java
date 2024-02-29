package t4_exam;

/* 난수(무작위수) 생성
	Math.random : 0 이상 ~ 1미만의 실수형 난수 사용 가능
	Math.random 은 double 타입임
	정수로 사용하려면 int로 강제 형변환 필요
*/
public class Test1 {
	public static void main(String[] args) {
		double rand = Math.random();
		System.out.println("0. random : " + rand);

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". random : " + Math.random());
		}
		System.out.println();

		// 0 이상 ~ 10 미만의 실수형 난수
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". random : " + Math.random() * 10);
		}
		System.out.println();

		// 0 이상 ~ 10 미만의 정수형 난수
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". random : " + (int) (Math.random() * 10));
		}
		System.out.println();

		// 1 이상 ~ 10 이하의 정수형 난수
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". random : " + (int) (Math.random() * 10 + 1));
		}

		System.out.println();
		// 1 이상 ~ 45 이하의 정수형 난수
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". random : " + (int) (Math.random() * 45 + 1));
		}
	}
}
