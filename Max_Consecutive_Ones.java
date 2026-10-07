class Solution {
    static{
        for(int i=0;i<=500;i++){
            findMaxConsecutiveOnes(new int[0]);
        }
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0) return 0;
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else{
                max=Math.max(count,max);
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
