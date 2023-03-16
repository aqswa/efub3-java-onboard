import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        if(minute>=45 && minute<=59) {
            answer.add(hour);
            answer.add(minute-45);
        }
        else if(minute>=0 && minute<45){
            if(hour>0 && hour<=23) {
                answer.add(hour-1);
                answer.add(60 - (45 - minute));
            }
            else if(hour==0) {
                answer.add(23);
                answer.add(60 - (45 - minute));
            }
        }
        return answer;
    }
}
