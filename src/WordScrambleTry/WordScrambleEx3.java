package WordScrambleTry;

//[문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.
import java.util.Scanner;

public class WordScrambleEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		
		while(true) {
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		String ans = "";
			 // 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.
		while(true) {
			System.out.println("question : " + question);
			System.out.println("answer : " );
			ans = scanner.nextLine();

				System.out.println("프로그램 종료를 원할시 q/Q/ㅂ을 입력해 주세요");
				if(ans.equalsIgnoreCase("q")||ans.equals("ㅂ")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				} 
				if(ans.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println(ans + "은/는 틀렸습니다. 다시 시도해주세요");
				}
			} //안 while
		 } //밖 while
	} // main

	private static String getAnswer(String[] strArr) {
		int rand = (int)Math.random()*strArr.length;	
		return strArr[rand];
	}

	private static String getScrambledWord(String str) {
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length*2; i++) {
			int rand = (int)(Math.random()*str.length());
			
			
			char tmp  = arr[0];
			arr[0] = arr[rand];
			arr[rand] = tmp;
		}
		
		return new String(arr);
	}

}
