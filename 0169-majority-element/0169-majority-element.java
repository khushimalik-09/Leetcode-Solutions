class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,cand=0;
        for(int num: nums){
            if(cnt==0) cand=num;
            if(cand==num) cnt++;
            else cnt--;
        }
        return cand;
    }
}