import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        //응급도에 따라 정렬한 뒤, 응급도의 인덱스를 answer값에 넣어주면 될듯요
        List<Integer> emerList = Arrays.stream(emergency)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        
        
        for(int i=0;i<emergency.length;i++){

            answer[i]= emerList.indexOf(emergency[i])+1;
        }
        
        return answer;
    }
}