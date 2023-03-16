package onboard;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = new Integer[20];
        int cards[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for(int i=0; i<flipCards.length; i++){
            int s = flipCards[i][0]-1;
            int e = flipCards[i][1]-1;
            int mid = (e-s)/2;
            for(int j=0; j<=mid; j++){
                int temp = cards[s+j];
                cards[s+j] = cards[e-j];
                cards[e-j] = temp;
            }
        }

        for(int i=0; i<20; i++){
            answer[i] = cards[i];
        }
        return answer;
    }
}
