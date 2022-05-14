package programmers;

public class Solution0513 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int sum=0;

        for(int i=1; i<count+1; i++){
            sum+=price*i;
        }
        if(sum>money) answer=sum-money;

        return answer;
    }
}