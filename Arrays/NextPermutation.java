class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // Step 1: Find the first decreasing element from right
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the element just greater than nums[i]
        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the elements after i
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

//-------_Logic for NextPermutation//

/*[1, 2, 5, 4, 3]
       ↓
Find 2      ← first smaller element from right

[1, 3, 5, 4, 2]
    ↑
Swap 2 and 3

[1, 3, 2, 4, 5]
       ↓
Reverse remaining part*/