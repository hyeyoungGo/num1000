package WordScrambleExam;
// [문제1] 다음의 예제를 완성하시오.
// getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
// getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
// (Math.random()사용)
                                             
class WordScrambleEx1 { 
      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            String answer = getAnswer(strArr); 
            String question = getScrambledWord(answer); 

            System.out.println("Question:"+question); 
            System.out.println("Answer:"+answer); 
      } // main 

      public static String getAnswer(String[] strArr) {
    		  int rand = (int)(Math.random()*strArr.length);
    		  return strArr[rand]; 
      } 
      
      public static String getScrambledWord(String str) { 
    	  char[] arr = str.toCharArray();    //String -> 배열
    	  
    	  for (int j = 0; j < str.length()*100; j++) {
    		  int rand= (int)(Math.random()*str.length());
    		  
    		  char tmp = arr[0];
    		  arr[0] = arr[rand];
    		  arr[rand] = tmp;
       	  }
    	  return new String(arr);
      } // scramble(String str) 
}
