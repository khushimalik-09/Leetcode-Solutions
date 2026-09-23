class Solution {
    public int maxProduct(int[] nums) {
        int leftprod=1, rightprod = 1;
        int n=nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(leftprod==0)leftprod=1;
            if(rightprod==0)rightprod =1;
            leftprod = leftprod*nums[i];
            rightprod= rightprod*nums[n-i-1];
            ans = Math.max(ans,Math.max(leftprod,rightprod));
        }
        return ans;
    }
}