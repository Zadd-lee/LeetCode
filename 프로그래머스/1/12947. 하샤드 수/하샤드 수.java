class Solution {
    public boolean solution(int x) {
        String[] xGa = String.valueOf(x).split("");
        int ga=0;
        
        for(String xG:xGa){
            ga+=Integer.valueOf(xG);
        }
        
        return x%ga==0;
    }
}