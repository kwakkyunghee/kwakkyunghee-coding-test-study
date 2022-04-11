package programmers;

public class num {

    public int solution(int[] nums) {
        int answer = -1;
        int a=0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    a=nums[i]+nums[j]+nums[k];
                    answer++;

                    if(a%k==0){
                        answer--;
                    }
                }
            }
        }
        return answer;
    }
}

