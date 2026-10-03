class Solution {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()
        for(i in nums.indices){
            if(i!=nums[i]) {
                return i;
            }
        }
        return nums.size
    }
}
