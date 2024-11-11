class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int hap = nums[i]+nums[j]+nums[k];
                    if(isSosu(hap)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    private boolean isSosu(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}