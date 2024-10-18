public class InsertionSort {
    public int[] sortArray(int[] nums) {
        if (nums == null) {
            return null; // Handle null input
        }
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = sorter.sortArray(nums);
        
        // Print sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
