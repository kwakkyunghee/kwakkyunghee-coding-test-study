package programmers;

public class Solution {
    public boolean solution(int x) {
        boolean answer=true;

        int a=0;
        int b=x;
        while(x>=1){
            a+=x%10;
            x/=10;
        }
        if(b%a==0){
            return answer;
        }
        else{
            return false;
        }
    }
}
