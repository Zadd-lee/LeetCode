class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        int temp = 1;

        if (Collections.frequency(numList,0)>1) {
            temp = 0;
        }else {
            for (int num : numList) {
                if (num != 0) {
                    temp *= num;
                }
            }
        }

        if (numList.contains(0)) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    answer[i] = temp;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = temp / nums[i];
            }
        }
        return answer;
        
    }
}