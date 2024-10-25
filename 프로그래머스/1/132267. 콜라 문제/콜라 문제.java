class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int reCola = 0;
        while(n>=a){
            reCola=(n/a)*b;
            answer+=reCola;
            n=n%a+reCola;
            
        }
        
        return answer;
    }
}