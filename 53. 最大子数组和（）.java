class Solution {
    public int maxSubArray(int[] nums) {
        int mx = nums[0], pre = 0;
        for (int num : nums){
            // 之前的一个最优解
            pre = Math.max(pre + num ,num);
            // 最优解
            mx = Math.max(pre,mx);
        }
        return mx;
    }
}

