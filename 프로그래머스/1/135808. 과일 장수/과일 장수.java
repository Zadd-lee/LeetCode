import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxNum = score.length/m;
        Arrays.sort(score);
        
        for(int i=score.length;i>=m;i-=m){
            answer+=score[i-m]*m;
        }
        return answer;
    }
}