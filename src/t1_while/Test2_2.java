package t1_while;

import java.util.Scanner;

// 반복문 탈출(break)
public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int su, breakSu;

		while (true) {
			System.out.print("1부터 출력할 수를 입력하세요 : ");
			su = sc.nextInt();

			System.out.print("탈출할 수를 입력하세요 : ");
			breakSu = sc.nextInt();

			if (su >= breakSu) {
				break;
			} else {
				System.out.println("첫번째 수를 두 번째수보다 더 큰 수를 입력하셔야 합니다.\n");
			}
		}

		while (i < su) {
			i++;
			System.out.println(i);
			if (i == breakSu) {
				System.out.println("탈출 완료");
				break;
			}
		}
		sc.close();
	}
}
