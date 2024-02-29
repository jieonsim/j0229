package t4_exam;

import java.util.Scanner;

// 1개의 주사위를 던졌을 때 나오는 숫자 맞추기 게임
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, random;
		
		while(true) {
			System.out.print("출력될 주사위의 눈금을 입력하세요 : ");
			su = sc.nextInt();
			/*
			if((su > 6) || (su < 1)) {
				System.out.println("1 ~ 6까지의 수를 입력하세요 : ");
			}
			else {
				break;
			}
			*/
			
			if(su >= 1 && su <= 6) {
				break;
			} else {
				System.out.println("1 ~ 6까지의 수를 입력하세요.");				
			}
		}

		random = (int) (Math.random() * 6 + 1);

		if (su == random) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다. 출력된 주사위 눈금은 " + random + " 입니다.");
		}
		sc.close();
	}
}
