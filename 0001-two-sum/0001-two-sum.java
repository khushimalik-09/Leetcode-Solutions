class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int needed = target-val;
            if(mpp.containsKey(needed)){
                ans[0]= mpp.get(needed);
                ans[1] = i;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}