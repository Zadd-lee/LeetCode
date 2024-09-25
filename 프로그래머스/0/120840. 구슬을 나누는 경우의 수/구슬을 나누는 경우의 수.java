class Solution {
    public int solution(int balls, int share) {
        double result = 1;
        
        for (int i = share + 1; i <= balls; i++) {
            result *= i;
        }
        
        for (int i = 2; i <= balls - share; i++) {
            result /= i;
        }
        
        // 결과를 반올림하여 int로 변환하여 반환합니다.
        return (int)Math.round(result);
    }
}