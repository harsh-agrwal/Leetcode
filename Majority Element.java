class Solution {
    public int majorityElement(int[] nums) {
        int majority_index = 0;
        int count = 1;
        for (int i=1; i < nums.length; i++){
            count += nums[i] == nums[majority_index] ? 1 : -1;

            if (count == 0){
                majority_index = ++i;
                count++;
            }
        }
        return nums[majority_index];
    }
}
