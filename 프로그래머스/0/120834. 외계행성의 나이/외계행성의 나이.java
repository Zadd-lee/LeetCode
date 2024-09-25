class Solution {
    public String solution(int age) {
        String answer ="";
        String age0to9 = "abcdefghij";
        //age를 문자로 형변환 후, Arr로 만들어 자릿수 끊어주기
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i=0;i<ageArr.length;i++){
            answer += age0to9.charAt(Integer.valueOf(ageArr[i]));
        }
        
        
        
        return answer;
    }
}