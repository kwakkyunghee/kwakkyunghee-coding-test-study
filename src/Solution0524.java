public class Solution0524 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
            //toLowerCase() 대상 문자열을 소문자로 바꾸기
            //toUpperCase() 대상 문자열을 대문자로 바꾸기
        }
        return answer;
    }
}