import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        int[] scoreByDay = new int[len];
        for(int i=0;i<len;i++){
            //시간에 따른 score 생성
            scoreByDay[i]=score[i];            
               List<Integer> scoreList=
                   Arrays.stream(scoreByDay)
                       .boxed()
                       .sorted(Comparator.reverseOrder())
                       .collect(Collectors.toList());
            
            //i<k 꼴등 : i
            if(i<k){
                answer[i] = scoreList.get(i);
                
            }else{ //i>k 꼴등 : k번째 값
                answer[i] = scoreList.get(k-1);
            }
        }
        return answer;
    }
}