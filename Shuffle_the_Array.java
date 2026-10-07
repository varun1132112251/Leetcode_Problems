class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length]; 
        int left = 0, right = n;
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[left];
            ans[++i] = nums[right];
            left++;
            right++;
        }
        return ans;
    }
}
