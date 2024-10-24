import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String t = Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .map(x->String.valueOf(x))
            .collect(Collectors.joining());
        return Long.parseLong(t);
    }
}