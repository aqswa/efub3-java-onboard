package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        List<Integer> numbers = new ArrayList<>();
        while(number > 0){
            numbers.add(number%10);
            number /= 10;
        }
        Collections.sort(numbers, Collections.reverseOrder());
        Integer mul = 1;
        for(int i=numbers.size()-1; i>=0; i--){
            answer += numbers.get(i) * mul;
            mul *= 10;
        }
        return answer;
    }
}
