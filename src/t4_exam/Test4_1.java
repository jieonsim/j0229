package t4_exam;

import java.util.Scanner;

public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("출력될 주사위의 눈금을 입력하세요 : ");
		int su = sc.nextInt();

		int random = (int) (Math.random() * 6 + 1);

		if (su == random) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다. 출력된 주사위 눈금은 " + random + " 입니다.");
		}
		sc.close();
	}
}
