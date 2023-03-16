package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(numbers);
        Integer mean = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / 5;
        answer.add(mean);
        answer.add(numbers[2]);
        return answer;
    }
}
