
import java.util.*;
class Solution {
    public int solution(String my_string) {
        int result =0;
        char[] myStringArr = my_string.toCharArray();
        for(char mystr:myStringArr){
           if(Character.isDigit(mystr)){
               result+=Character.getNumericValue(mystr);
           };
        }
        return result;
    }
}