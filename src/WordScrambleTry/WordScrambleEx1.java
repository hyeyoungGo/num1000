package WordScrambleTry;

//[문제1] 다음의 예제를 완성하시오.
//getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
//getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
//(Math.random()사용)

public class WordScrambleEx1 {
	public static void main(String[] args) {
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		
		System.out.println("question : " + question);
		System.out.println("answer : " + answer);
	}

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
