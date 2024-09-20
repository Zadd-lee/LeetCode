import java.util.*;
class Solution {
    public int[] solution(int n) {
        //list 생성
        ArrayList<Integer> answerList = new ArrayList<>();
        
        //for문으로 값 생성 후 넣기
       if(n%2==0){
           for(int i =1;i<n;i+=2){
               answerList.add(i);
           }
       }else{
           for(int i=1; i<=n;i+=2){
               answerList.add(i);
           }
       }
        //array 로 변경

        
        int [] result = answerList.stream()
                    .mapToInt(Integer::intValue)
                        .toArray();
        return result;
    }
}