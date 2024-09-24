class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        int index = sb.indexOf(letter);
        while(index !=-1){
            sb.deleteCharAt(index);
            index = sb.indexOf(letter);
        }
        return sb.toString();
    }
}