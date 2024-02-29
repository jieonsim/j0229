package t4_exam;

import java.util.Scanner;

// 최대값 구하기 (초기값 지정 방식) - Switching 기법 적용
// 단 두자리 이하의 정수만을 입력 받는다
public class Test5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = -99;
		int min = 99;
		int su;
		int sw = 0; // 스위칭 변수

		while (true) {
			System.out.print("숫자를 입력하세요(종료 시 999 입력) : ");
			su = sc.nextInt();
			if (su == 999) {
				break;
			}
			if (su > max) {
				max = su;
				if (sw == 0) {
					sw = 1;
					if (su < min) {
						min = su;
					}
				}
			} else if (su < min) {
				min = su;
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		sc.close();
	}
}
