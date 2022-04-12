package programmers;

public class Solution {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);//12345%10=5
            n/=10;//n=1234
            cnt++;
        }
        return answer;
    }
}
