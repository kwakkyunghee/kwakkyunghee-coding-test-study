package programmers;

public class ne {
    public int ne(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer+=a[i]*b[i];
        }
        return answer;
    }
}

