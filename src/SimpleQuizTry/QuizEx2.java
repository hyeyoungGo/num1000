package SimpleQuizTry;

import java.util.Scanner;

class QuizEx2 { 
	public static void main(String[] args) {
		String[] data = { 
				"다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		};
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String input = "";
		
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
			input = scanner.nextLine();
			if(input.equals(answer))
				score++;
		}
		
		System.out.println("맞은갯수" + score + "/문항수" + data.length);
	}

}