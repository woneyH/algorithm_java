class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sortDescending()
        var returnValue = false
        for(i in 1..<nums.size) {
            if(nums[i] == nums[i - 1]) {
                returnValue = true
            }
        }
        return returnValue
    }
}
