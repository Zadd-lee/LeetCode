class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb= new StringBuffer();
        char[] myString = my_string.toCharArray();
        for(char c:myString){
            for(int i=0;i<n;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}