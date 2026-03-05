class Solution {
    public int searchInsert(int[] nums, int target) {
        int prev = nums[0];

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            
            if(n >= target){
                return i;
            }
        }
        return nums.length;
    }
}