import java.util.*;
class Solution {
    public int solution(int num, int k) {
        String[] n = String.valueOf(num).split("");
        int index = Arrays.asList(n).indexOf(String.valueOf(k));
        if(index!=-1){
            index +=1;
        }
        return index;
    }
}