class Solution {
    public int maximumCount(int[] nums) {
        int neg = countNeg(nums); 
        int pos = nums.length - countPos(nums); 

        return Math.max(pos, neg); 
    }

    private int countNeg(int[] nums) {
        int left = 0, right = nums.length - 1; 
        int result = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                result = mid; 
                right = mid - 1; 
            }
        }

        return result;
    }

    private int countPos(int[] nums) {
        int left = 0, right = nums.length - 1; 
        int result = nums.length; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                result = mid; 
                right = mid - 1;
            }
        }

        return result; 
    }
}