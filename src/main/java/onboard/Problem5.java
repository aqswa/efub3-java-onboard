package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        for(int i=values.length-1; i>=0; i--){
            if(K/values[i] > 0){
                answer += K/values[i];
                K %= values[i];
            }
        }
        return answer;
    }
}
