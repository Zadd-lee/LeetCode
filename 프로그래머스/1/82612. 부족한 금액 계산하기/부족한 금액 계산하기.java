class Solution {
    public long solution(int price, int money, int count) {
        long pee = 0L;
        for(int i=1;i<=count;i++){
            pee +=price *i;
            
        }
        if(pee<money){
            return 0;
        }else{
        return pee - money;
        }
    }
}