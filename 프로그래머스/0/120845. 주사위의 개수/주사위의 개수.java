class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int a:box){
            answer*=a/n;
        }
        return answer;
    }
}