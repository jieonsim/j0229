package t3_for;

// void(리턴 타입이 없을 때) return 을 쓰면 현재(main) 메소드를 탈출함
public class Test8 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				cnt++;
				System.out.println(cnt + ". i = " + i + ", j = " + j);
				// 앞의 문장을 6번 수행 후 탈출시키고자 함
				if(cnt == 6) {
					return;
					// return 은 아예 메인 메소드를 탈출하기 때문에 작업 끝이 수행되지 않고 완전히 나감
				}
			}
			System.out.println();
		}
		System.out.println("작업 끝");
	}
}
	