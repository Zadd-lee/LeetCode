class Solution {
    public String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();
        int len = phone_number.length();
        for(int i=0;i<len-4;i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(len-4,len));
        return sb.toString();
    }
}