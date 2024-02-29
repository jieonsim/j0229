package t1_while;

// 무한루프 예시
public class Test3_2 {
	public static void main(String[] args) {
		byte i = 0;
		
		while(true) {
			i++;
			System.out.println(i + "안녕");
			// 127 넘어가면 -128로 바뀌면서 무한루프에 빠짐
		}
	}
}
