class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tam = nums.length;

        for (int i = 0; i < tam; i++){
            for (int j = 0; j < tam; j++){
                if (i != j){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{0, 0};
    }
}