package t3_for;

/*
 중첩 for 문
*/
public class Test6 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				cnt++;
				System.out.println(cnt + ". i = " + i + ", j = " + j);
				// 앞의 문장을 6번 수행 후 탈출시키고자 함
				if(cnt == 6) {
					break;
					// break는 가장 가까운 for문을 탈출함
				}
			}
			System.out.println();
		}
		System.out.println("작업 끝");
	}
}
