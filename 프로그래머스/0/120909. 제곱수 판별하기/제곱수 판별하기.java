class Solution {
    public int solution(int n) {
        int su =2;
        while(Math.pow(su,2)<=n){
            if(Math.pow(su,2)==n)
                return 1;
            su++;
        }
        return 2;
    }
}