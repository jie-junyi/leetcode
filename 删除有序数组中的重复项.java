public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int i = 0,k = 0;
        if(nums.length==0){
            return 0;
        }
        else {
            for ( i = 0; i < nums.length-1; i++) {
                if (nums[i] == nums[i + 1]) {
                    k++;
                } else {
                    nums[i - k] = nums[i];
                }
            }
            nums[i - k] = nums[i];
            return nums.length - k;
        }
    }
}
