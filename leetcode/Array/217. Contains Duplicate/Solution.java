class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isDuplicate = false;
        for(int i=1; i< nums.length; i++) {
            if(nums[i-1]==nums[i]) isDuplicate = true;
        }
        return isDuplicate;
    }
}
