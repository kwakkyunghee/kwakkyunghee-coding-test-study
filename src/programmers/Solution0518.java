package programmers;

import java.util.*;

public class Solution0518 {
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1])list.add(arr[i]);
            if(i==arr.length-2)list.add(arr[arr.length-1]);
        }

        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}