package ex;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println("두 개의 주사위를 던지겠습니다.\n두 눈의 합이 5일 경우 종료될 예정입니다.");
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int sum = dice1 + dice2;
			
			System.out.println("- 결과 : " + "(" + dice1 + ", " + dice2 + ")");

			if (sum == 5) {
				System.out.println("눈의 합이 5가 되어 종료합니다.");
				break;
			} else {
				System.out.println("눈의 합이 5가 되지 않아 주사위를 다시 던집니다.");
			}
		}
	}
}
