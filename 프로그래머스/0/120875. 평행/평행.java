class Solution {
    public int solution(int[][] dots) {
        //x1x2
        if (gradient(dots[0],dots[1])==gradient(dots[2],dots[3])) return 1;
        //x1x3
        if (gradient(dots[0],dots[2])==gradient(dots[1],dots[3])) return 1;

        //x2x3
        if (gradient(dots[1],dots[2])==gradient(dots[0],dots[3])) return 1;

        return 0;
    }
    public double gradient(int[] a, int[] b){
        return (b[1] - a[1]) * 1.0 / (b[0] - a[0]);
    }

}