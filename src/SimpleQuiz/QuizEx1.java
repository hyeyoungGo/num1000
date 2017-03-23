package SimpleQuiz;

import java.util.Arrays;

// [문제1] 주어진 문자열 데이터를 가지고 실행결과와 같이 출력되도록 코드를 완성하세요.
// 데이터의 형식은 문제, 답, 선택지의 순서로 되어 있으며 구분자는 `(숫자1옆의 키)입니다.

class QuizEx1 { 
	public static void main(String[] args) { 
		String[] data = { 
				"다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		};
		
		for(int i=0;i<data.length;i++) {
			// 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
			// 2. 문제를 출력하세요.
			// 3. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.
			// 4.반복문을 이용해서 선택지를 출력하세요.
			String[] tem = data[i].split("`",3 );   // data의 구분자를`로 설정하고 3개로 나눈다.
			
			String question = tem[0];  // 첫번째 배열에 문제를 저장한다.
			String answer = tem[1];		// 두번째 배열에 답을 저장한다.
			String[] choices = tem[2].split("`");	// 세번재 배열에 선택지를 저장한다.
																		// 선택지를 choices 배열로 선언, 구분자는 `
			
			System.out.println("[" + (i+1) + "]"+question);	// 문제옆에 문제번호를 같이 출력한다. 문제는 1씩 증가
			                                                                                                                                                                        
			for(int j=0; j<choices.length; j++){	// 선택지의 배열칸을 j로 선언
				System.out.print((j+1)+"."+choices[j]+"\t");  // 선택지는 1번부터 시작 배열의 인덱스는 0부터 증가
																						  // 배열인덱스(j)+1을 하면 j칸에 있는 선택지의 번호는 j+1번
																						  // 그리고 choices(선택지)배열안에 j번째 선택지를 출력
			}
			System.out.println();
		}
	}
}