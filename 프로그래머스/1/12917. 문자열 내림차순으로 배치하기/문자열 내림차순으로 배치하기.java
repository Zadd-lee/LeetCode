import java.util.*;

class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        Arrays.sort(ss,Comparator.reverseOrder());
        return String.join("",ss);
    }
}