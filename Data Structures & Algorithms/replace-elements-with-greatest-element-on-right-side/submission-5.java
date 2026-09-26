class Solution {
    public int[] replaceElements(int[] arr) {
        int count = arr.length;
        int[] nums = new int[count];
        int rightMax = -1; 
        for (int i = count - 1; i >= 0; i--) {
            nums[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        return nums;
    }
}