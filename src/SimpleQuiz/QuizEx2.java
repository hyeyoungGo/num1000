package SimpleQuiz;

// [문제2] 문제1에서 완성된 코드에 사용자 입력을 받아서 정답여부를 판단하여 마지막에 최종점수를 실행결과와 같이 출력하도록 코드를 완성하세요.
import java.util.*; 

class QuizEx2 { 
	public static void main(String[] args) { 
		String[] data = { 
				"다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false`", 
		}; 
		
		Scanner scanner = new Scanner(System.in); 
		int score = 0; 
		String text = "";

		for(int i=0;i < data.length;i++) {
			String[] tmp = data[i].split("`",3); 

			String question = tmp[0]; 
			String answer = tmp[1]; 
			String[] choices = tmp[2].split("`"); 

			System.out.println("["+(i+1)+"] "+question); 
       
			for(int j=0; j < choices.length; j++) {
				System.out.print((j+1)+"."+choices[j]+"\t");
			}
			System.out.println();
			text = scanner.nextLine();
			
			if(text.equals(answer)) {
				score++;
			}
			
		} 
		
		System.out.println("정답갯수"+score+" / 문항수" + data.length); 
	} // main 
	
}