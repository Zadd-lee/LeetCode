import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int hap = numbers[i]+numbers[j];
                if(!ans.contains(hap)){
                    ans.add(hap);
                }
            }
        }

        return ans.stream()
            .mapToInt(x->x)
            .sorted().toArray();
    }
}