class Solution {
    public int removeElement(int[] nums, int val) {
        // single-element arrays
        int size = nums.length;
        if (size == 1) {
            if (nums[0] == val) {
                return 0;
            }
        }
        int count = 0;
        int i = 0; 
        int j = nums.length - 1;
        while (i <= j) {
            if(nums[i] == val) {
                if(nums[j] != val) {
                    int tmp = nums[j];
                    nums[i] = tmp;
                    nums[j] = val;
                    j--;
                } else if (nums[j] == val) {
                    j--;
                }
            } else {
                i++;
            }
        }
        return i;
    }
}