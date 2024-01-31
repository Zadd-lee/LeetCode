class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int temp = 0;
        for (int i : candies) {
            if (temp <= i) {
                temp = i;
            }
        }
        List<Boolean> result=new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if (temp <= candies[i] + extraCandies) {
                result.add(true);
            }else result.add(false);
        }


        return result;
    }
}