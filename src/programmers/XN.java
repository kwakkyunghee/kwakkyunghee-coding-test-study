package programmers;

public class XN {
    public long[] XN(int x, int n) {
        long[] answer = new long[n];

        int a=0;
        for(int i=0; i<n; i++){

            answer[i]=a+x;
            a+=x;

        }

        return answer;
    }
}
