package t4_exam;

/*
 3 2 1
 6 5 4
 9 8 7
 
 바깥 쪽 for 문 : 행
 안 쪽 for 문 : 열
 */
public class Star4 {
	public static void main(String[] args) {
		int su = 4;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				su--;
				System.out.print(su + " ");
			}
			su += 6;
			System.out.println();
		}
	}
}
