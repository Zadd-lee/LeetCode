import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0]+(m-1);
        int ans = 1;
        for(int i:section){
            if(i>=start && end>=i){
                continue;
            }else{
                start = i;
                end = i + (m-1);
                ans++;
            }
        }
        
        return ans;
    }
}