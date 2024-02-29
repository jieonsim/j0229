package ex;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		int balance = 0;
		int deposit = 0;
		int withdraw = 0;

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("예금액 > ");
					deposit = scanner.nextInt();
					balance += deposit;
					break;
				case 2:
					System.out.print("출금액 > ");
					withdraw = scanner.nextInt();
					if (balance >= withdraw) {
						balance -= withdraw;
					} else {
						System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
					}
					break;
				case 3:
					System.out.println("현재 잔액은 " + balance + "원입니다.");
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요");
					continue;
			}
		}
		scanner.close();
	}
}
