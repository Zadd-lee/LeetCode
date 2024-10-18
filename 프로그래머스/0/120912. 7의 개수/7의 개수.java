class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int a:array){
            for(String aa: String.valueOf(a).split(""))
                if(Integer.parseInt(aa)==7)
                    answer++;
        }
        return answer;
    }
}