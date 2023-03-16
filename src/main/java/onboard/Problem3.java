package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        Collections.sort(numbers);
        Integer mean = (numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3) + numbers.get(4)) / 5;
        answer.add(mean);
        answer.add(numbers.get(2));
        return answer;
    }
}
