package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = "";

		for (int i = 1; i <= 6; i++) {
			lotto = (int) (Math.random() * 45) + 1;
			str += lotto + " / ";
		}
		System.out.println("금주의 로또 번호는 : " + str);
		// 다만 중복된 수가 나올 수 있음. 중복 예외 배우지 않아서 아직은 처리 불가
	}
}
