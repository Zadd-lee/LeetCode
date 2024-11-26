class Solution {
    public int solution(int number, int limit, int power) {
        //약수 개수 확인
        //제한 걸리는 지 확인
        //철 무게 확인
        int answer = 0;
        for(int i=1;i<=number;i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) cnt++;
                else if (i%j==0) cnt+=2;
            }
            
            if(cnt > limit) cnt = power;
            answer+=cnt;
        }
        
        return answer;
    }
    
}