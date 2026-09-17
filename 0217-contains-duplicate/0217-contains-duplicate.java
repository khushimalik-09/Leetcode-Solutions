class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> meow = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(meow.contains(nums[i]))return true;
            meow.add(nums[i]);
        }
        return false;
    }
}