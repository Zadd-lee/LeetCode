class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char c:s.toCharArray()){
            int cnt = 0;
            while(cnt<index){
                if(c=='z'){
                    c='a';
                }else{
                    c++;
                }
                if (!skip.contains(String.valueOf(c))) {
                    cnt++;
                }
                
            
            }
            if((int)c>122){
                c-=26;
            }
            
            answer+=c;
        }
        return answer;
    }
}