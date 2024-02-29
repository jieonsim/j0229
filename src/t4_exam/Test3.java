package t4_exam;

import java.util.Scanner;

/* 숫자 맞추기 게임(1~100까지의 자연수) / 단, 기회는 다섯번
 랜덤 숫자와 입력 숫자가 맞을 경우
 입력 숫자가 랜덤 숫자보다 작을 경우
 입력 숫자가 랜덤 숫자보다 클 경우
 5번 기회 모두 소진 할 경우
*/

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rand = (int) (Math.random() * 100 + 1);
		int cnt = 1;
		int su;

		while (cnt <= 5) {
			System.out.print(cnt + ". 1 ~ 100 사이의 수를 입력하세요 : ");
			su = sc.nextInt();
			if (su == rand) {
				System.out.println("정답입니다.");
				break;
			} else if (su > rand) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("더 큰 수를 입력하세요.");
			}
			cnt++;
		}
		if(cnt == 6) {
			System.out.println("정답은 " + rand + "였습니다. 다음 기회를 노려보세요.");
		}
		sc.close();
	}
}
