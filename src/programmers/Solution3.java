package programmers;
class Solution3 {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                //equals() 메소드는 객체끼리 내용 비교한다
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
