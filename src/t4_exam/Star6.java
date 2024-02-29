package t4_exam;

/*
 
 *****
 ****
 ***
 **
 *
 
 바깥 쪽 for 문 : 행
 안 쪽 for 문 : 열
 */
public class Star6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
