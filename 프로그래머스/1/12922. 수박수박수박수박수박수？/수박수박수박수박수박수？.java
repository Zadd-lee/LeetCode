class Solution {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String su = "수";
        String bak = "박";
        
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sb.append(bak);
            }else{
                sb.append(su);
            }
        }
        
        return sb.toString();
    }
}