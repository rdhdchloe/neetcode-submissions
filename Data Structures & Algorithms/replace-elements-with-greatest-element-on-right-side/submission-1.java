class Solution {
    public int[] replaceElements(int[] arr) {
        int count = arr.length;
        int[] nums = new int[count];
        int rightMax = -1; 
        for (int i = count - 1; i > 0; i--) {
            nums[i - 1] = Math.max(rightMax, arr[i]);
            rightMax = nums[i -1];
        }
        nums[count-1] = -1;
        return nums;
    }
}