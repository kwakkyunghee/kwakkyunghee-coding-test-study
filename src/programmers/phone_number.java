package programmers;

public class phone_number {

    public String phone_number(String phone_number) {
        String answer = "";


        for (int i = 0; i < phone_number.length(); i++) {

            if (i < phone_number.length() - 4) {
                answer += "*";
            }


        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;

    }

}
