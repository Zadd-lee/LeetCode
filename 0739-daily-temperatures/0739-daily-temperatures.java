class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> tempGap = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!tempGap.isEmpty() && temperatures[tempGap.peek()] < temperatures[i]) {
                int ind = tempGap.pop();
                result[ind] = i - ind;
            }
            tempGap.push(i);
        }

        return result;
    }
}