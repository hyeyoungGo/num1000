package SimpleQuizTry;

//[문제1] 주어진 문자열 데이터를 가지고 실행결과와 같이 출력되도록 코드를 완성하세요.
//데이터의 형식은 문제, 답, 선택지의 순서로 되어 있으며 구분자는 `(숫자1옆의 키)입니다.
class QuizEx1 { 
	public static void main(String[] args) {
		String[] data = { 
				"다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		};
		
		for (int i = 0; i < data.length; i++) {
			String[] tem = data[i].split("`", 3);
			String question = tem[0];
			String answer = tem[1];
			String[] choice = tem[2].split("`");
			
			System.out.println();
			System.out.println("[" + (i+1) + "] " + question);
			
			for (int j = 0; j < choice.length; j++) {
				System.out.print((j+1) + "." + choice[j] + "\t");
				
			}
			System.out.println();
		}
	}

}