import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1){
            int[] result = {-1};
            return result;
        }
        return Arrays.stream(arr)
            .filter(x->x!=Arrays.stream(arr)
                                .min()
                                .orElse(0))
            .toArray();
    }
}