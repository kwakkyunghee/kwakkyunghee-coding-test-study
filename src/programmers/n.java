package programmers;

public class n {
    public long n(long n) {
        long answer = 0;
        int a=0;

        for(int i=0; i*i<=n; i++){
            a=i*i;
            if(a==n){
                answer=(i+1)*(i+1);
            }
            else if(i*i!=0){
                answer=-1;
            }
        }
        return answer;
    }
}
