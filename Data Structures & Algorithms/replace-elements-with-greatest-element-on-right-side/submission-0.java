class Solution {
    public int[] replaceElements(int[] arr) {
        int count = arr.length;
        for (int i =0 ; i< count; i++) {
            // copy
            int[] subArray = Arrays.copyOfRange(arr, i + 1, count);
            // find max
            int max = findMax(subArray);
            // replace
            arr[i] = max;
        }
        arr[count - 1] = -1;
        return arr;
    }
    public int findMax(int[] nums) {
        int max = 0;
        for (int num:nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}