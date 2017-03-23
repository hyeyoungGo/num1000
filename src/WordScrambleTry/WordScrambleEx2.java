package WordScrambleTry;
//[문제2] 다음의 예제에서 while문의 내부를 주석의 내용을 참고해서 완성하세요.

import java.util.Scanner;

public class WordScrambleEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		String ans = "";
		
		 while(true) { 
			 // 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
             // 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
             // 3. 사용자가 정답을 맞출때까지 반복하다가
             //     사용자가 정답을 맞추면, while문을 빠져나간다.
			System.out.println("question : " + question);
			System.out.println("answer : " );
			ans = scanner.nextLine();
			
			System.out.println("프로그램 종료를 원할시 q/Q/ㅂ을 입력해 주세요");
			if(ans.equalsIgnoreCase("q")||ans.equals("ㅂ")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			} if(ans.equalsIgnoreCase(answer)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println(ans + "은/는 틀렸습니다. 다시 시도해주세요");
			}
		 }
	}

	private static String getAnswer(String[] strArr) {
		int rand = (int)(Math.random()*strArr.length);	
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
