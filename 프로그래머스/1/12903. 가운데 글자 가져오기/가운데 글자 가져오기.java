class Solution {
    public String solution(String s) {
        int len= s.length();
        //짝수 일 경우 
        if(len%2==0){
            return s.substring(len/2-1,len/2+1);
        }else{//홀수 일 경우 가운데 인덱스만 가져오기
            return s.substring(len/2,len/2+1);
        }
    }
}