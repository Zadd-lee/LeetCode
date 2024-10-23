import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> intList
            = Arrays.stream(numbers)
            .boxed()                        
            .collect(Collectors.toList());
        for(int i=0;i<=9;i++){
            if(!intList.contains(i)){
                answer+=i;
            }
        }

        return answer;
    }
}