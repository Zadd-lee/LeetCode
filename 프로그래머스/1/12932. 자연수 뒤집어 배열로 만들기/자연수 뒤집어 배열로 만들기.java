import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuffer sb = new StringBuffer();
        sb.append(n);
        sb.reverse();
        String[] res = sb.toString().split("");
        int[] result = new int[res.length];
        
        for(int i=0;i<result.length;i++){
            result[i] = Integer.parseInt(res[i]);
        }
        
        return result;

    }
}