class Solution {
    public int jump(int[] nums) {
        int destination = nums.length-1;
        int coverage = 0;
        int lastJumpindex = 0;
        int totaljumpindex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums.length == 1) {
                return 0;
            }
            coverage = Math.max(coverage, i+nums[i]);
            if(i == lastJumpindex) {
                lastJumpindex = coverage;
                totaljumpindex++;
            
            if(coverage >= destination) {
                return totaljumpindex;
            }
            }
        }
        return totaljumpindex;
    }
}