package WordScrambleExam;
import java.util.Scanner;

//[문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.

public class WordScrambleEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
        
        while(true)	{
        	String answer = getAnswer(strArr);
        	String question = getScrambledWord(answer);
        	String quest = "";       
        	
        	while(true) {
        		System.out.println("Question :" + question);
        		System.out.println("Your answer is :"+quest);
        		quest = scanner.nextLine();

        		if(quest.equalsIgnoreCase(answer)) {
        			System.out.println("정답입니다.");
        			System.out.println("프로그램 종료를 원하시면 q/Q/ㅂ을 입력해 주세요.");
        			break;
            	} if(quest.equalsIgnoreCase("q") || quest.equals("ㅂ")) {
            		System.out.println("프로그램 종료");
            		System.exit(0);
            	} else {
            		System.out.println(quest + "은/는 정답이 아닙니다. 다시 시도해보세요.");
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
  } // scramble(String str)

}
