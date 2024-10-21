class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long addN = x;
        for(int i=0; i<n;i++){
            answer[i]=addN;
            addN+=x;
        }
        return answer;
    }
}