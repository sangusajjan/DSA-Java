class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       TreeSet<Integer> tree = new TreeSet<>();
       for(int i = 0; i < nums.length; i++) {
        tree.add(nums[i]);
       } 
       List<Integer> result = new ArrayList<>();
       for(int i = 1; i <= nums.length; i++) {
        if(!tree.contains(i)) {
            result.add(i);
        }
       }
       return result;
    }
}