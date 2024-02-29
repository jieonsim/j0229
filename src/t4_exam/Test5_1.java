package t4_exam;

import java.util.Scanner;

// 최대값 구하기 (Two Read)
public class Test5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int su = sc.nextInt();

		int max = su;
		int min = su;

		while (true) {
			System.out.print("숫자를 입력하세요(종료 시 999 입력) : ");
			su = sc.nextInt();
			if (su == 999) {
				break;
			}
			if (su > max) {
				max = su;
			} else if (su < min) {
				min = su;
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		sc.close();
	}
}
