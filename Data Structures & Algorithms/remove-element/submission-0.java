class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int temp = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    count++;
                }
                j--;
            } else {
                i++;
                count++;
            }
        }
        return count;
    }
}