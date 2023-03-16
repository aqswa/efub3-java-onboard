package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0; i<flipCards.length; i++){
            int s = flipCards[i][0];
            int e = flipCards[i][1];
            int mid = (s-e)/2;
            for(int j=0; j<=mid; j++){
                int temp = anser[s+j];
                answer[s+j] = answer[e-j];
                answer[e-j] = temp;
            }
        }
        return answer;
    }
}
