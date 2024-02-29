package t3_for;

/*
 for(int i = 초기값; 조건식; 증감식) {
 	조건을 만족할 때 수행 처리할 내용
 }
 */
public class Test4 {
	public static void main(String[] args) {
		// 조건을 만족한다면 해당 조건만큼만 처리할 내용을 수행한다
		// 초기값, 조건식, 증감식이 없으면 조건을 참으로 봐서 무한루프에 빠짐
		
		int i = 0;
		
		for(; ; ) {
			i++;
			System.out.println(i);
			if(i == 10) {
				break;
			}
		}
		System.out.println("작업 끝");
	}
}
