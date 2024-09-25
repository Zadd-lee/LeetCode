class Solution {
    public String solution(String my_string) {
        String[] my_stringArr = my_string.split("");
        StringBuffer sb = new StringBuffer();
        for(String str: my_stringArr){
            if((int)str.charAt(0)>=65 && (int)str.charAt(0)<=90){
                sb.append(str.toLowerCase());
            }else if((int)str.charAt(0)>=97 && (int)str.charAt(0)<=122){
                sb.append(str.toUpperCase());
            }

        }
        return sb.toString();
    }
}