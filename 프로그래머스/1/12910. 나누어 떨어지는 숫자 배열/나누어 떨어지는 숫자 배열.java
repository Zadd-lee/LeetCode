import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result =  Arrays.stream(arr)
            .filter(x->x%divisor==0)
            .sorted()
            .toArray();
        
        if(result.length==0){
            result = new int[1];
            result[0]=-1;
        }
        return result;
        
    }
}