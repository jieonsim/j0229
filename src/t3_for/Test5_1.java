package t3_for;

/*
 중첩 for 문
 안쪽 for x 바깥쪽 for
*/
public class Test5_1 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				cnt++;
				System.out.println(cnt);
			}
		}
	}
}
