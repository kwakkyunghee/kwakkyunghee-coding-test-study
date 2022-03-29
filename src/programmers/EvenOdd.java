package programmers;

public class EvenOdd {
    public String EvenOdd(int num) {
        String answer = "";
        int a=num%2;

        if(a==0){
            return "Even";

        }
        else if(a!=0){
            return "Odd";
        }

        return answer;
    }
}
