class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bb = {"aya", "ye", "woo", "ma"};
        
        for(String ba:babbling){
            if(ba.contains("ayaaya") ||
              ba.contains("yeye") ||
              ba.contains("woowoo") ||
              ba.contains("mama")){
                continue;
            }
            for(String b:bb){
                ba = ba.replace(b," ");
                
            }
            ba = ba.replace(" ","");
            if(ba.length() ==0){
                answer++;
            }
            
            System.out.println(ba);
        }
        return answer;
    }
}