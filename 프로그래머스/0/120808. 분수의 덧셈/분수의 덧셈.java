class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int answer[] = {1,1};
        int numerAnswer=numer1*denom2+numer2*denom1;
        int denomAnswer=denom1*denom2;
        int gcd = getGcd(numerAnswer,denomAnswer);
        answer[0]=numerAnswer/gcd;
        answer[1]=denomAnswer/gcd;
        return answer;
    }
    private int getGcd(int a, int b){
    if(b == 0) return a;
        return getGcd(b, a % b);
    }
}