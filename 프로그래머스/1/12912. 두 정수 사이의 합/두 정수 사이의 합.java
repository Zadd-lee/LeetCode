class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int small = a;
        int big = b;
        if(a>b){ small = b;
                big = a;
        }
        for(int i = small;i<=big;i++){
            answer+=i;
        }
        return answer;
    }
}