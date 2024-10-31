import java.util.*;
class Solution {
    public int solution(int n) {
        Stack<Integer> three = new Stack<>();
        //3진법 변경 + 반전
        while(n>0){
            three.push(n%3);
            n/=3;
        }
        
        int result = 0;
        int cnt = 0;
        while(!three.isEmpty()){
            result +=(int) three.pop()*Math.pow(3,cnt);
            cnt+=1;
        }
        return result;
    }
}