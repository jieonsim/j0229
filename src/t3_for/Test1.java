package t3_for;

/*
 for(int i = 초기값; 조건식; 증감식) {
 	조건을 만족할 때 수행 처리할 내용
 }
 */
public class Test1 {
	public static void main(String[] args) {
		// 조건을 만족한다면 해당 조건만큼만 처리할 내용을 수행한다
		// for 문은 조건을 만족하지 않으면 한번도 수행 안함
		for(int i = 1; i == 10; i++) {
			System.out.println(i);
		}
		System.out.println("작업 끝");
	}
}
