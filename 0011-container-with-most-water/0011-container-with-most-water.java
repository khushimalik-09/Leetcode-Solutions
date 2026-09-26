class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        int left=0, right=height.length-1;
        while(left<right){
            int ar = Math.min(height[left],height[right]) * (right-left);
            maxi = Math.max(maxi,ar);
            if(height[left]<height[right])left++;
            else right--;
        }
        return maxi;
    }
}