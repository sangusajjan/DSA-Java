class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.print("[");
        for(int i = 0; i < nums1.length; i++) {
            if(i < nums1.length-1){
            System.out.print(nums1[i] + ",");
            }
            else {
                System.out.print(nums1[i]);
            }
        }
       
        System.out.print("]");
    }
}