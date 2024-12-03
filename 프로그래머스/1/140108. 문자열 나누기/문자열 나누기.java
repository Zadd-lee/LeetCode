class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 1;
        char prevChar = s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            char curChar = s.charAt(i);
            
            if(count==0){
                prevChar = curChar;
                count++;
                continue;
            }
            
            if(prevChar == curChar){
                count ++;
            }else{
                count --;
            }
            
            if(count == 0){
                answer++;
            }
        }
        
        if(count!=0){
            answer++;
        }
        return answer;
    }
}