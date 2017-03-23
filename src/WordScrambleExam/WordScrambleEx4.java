package WordScrambleExam;
// [문제4] 실행결과를 잘 보고, 다음의 예제의 getHint메서드를 완성하세요.
// String getHint(String answer, char[] hint) - 문제의 답의 일부를 보여주는 메서드
// 한번 틀릴 때마다 한글자씩 더 보여준다.
// answer - 문제의 정답
// hint - 문제의 이전 힌트(previous hint)

import java.util.Scanner;

public class WordScrambleEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
        
        while(true)	{
        	String answer = getAnswer(strArr);
        	String question = getScrambledWord(answer);
        	String quest = "";
        	char[] hint = new char[answer.length()];
        	
        	 // hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
        	for(int i=0; i<hint.length; i++) {
        		hint[i] = '_';
        	}
        	
        	while(true) {
        		System.out.println("Question :" + question);
        		System.out.println("Your answer is :"+quest);
        		quest = scanner.nextLine();
        		
        		if(quest.equalsIgnoreCase(answer)) {
        			System.out.println("정답입니다..");
        			System.out.println("프로그램 종료를 원하시면 q/Q/ㅂ을 입력해 주세요.");
        			break;
            	} if(quest.equalsIgnoreCase("q") || quest.equals("ㅂ")) {
            		System.out.println("프로그램 종료");
            		System.exit(0);
            	} else {
            		System.out.println(quest + "은/는 정답이 아닙니다. 다시 시도해보세요.");
            		System.out.println("Hint : " +getHint(answer,hint));
            		System.out.println("프로그램 종료를 원하시면 q/Q/ㅂ을 입력해 주세요.");
            	}
        	}
        }
	}
	
	public static String getAnswer(String[] strArr) { 
        int idx = (int)(Math.random()*strArr.length); 
        return strArr[idx];
	}
	
	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray(); 
        
        for(int i=0;i<str.length()*2;i++) {
        	int idx = (int)(Math.random()*str.length());
        	char tmp = chArr[0];
        	chArr[0] = chArr[idx];
        	chArr[idx] = tmp; 
        }
        return new String(chArr);
	}
	
	public static String getHint(String answer, char[] hint) {
		int count =0;  // 힌트에 포함된 '_'의 개수
		
		for(int i=0; i<hint.length; i++) {
			if(hint[i] == '_')   // 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
				count++;
		}
		
		if(count>2){  //  count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
			while(true) {
			int ht = (int)(Math.random()*answer.length()); // Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.
			hint[ht] = answer.charAt(ht);
			break;
			}
		}
		return new String(hint);
	}

}
