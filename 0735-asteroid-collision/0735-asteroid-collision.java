class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
        for(int curr: asteroids){
            boolean alive = true;
            while(!st.isEmpty() && curr<0 && st.peek()>0){
                int top = st.peek();
                if(Math.abs(top)<Math.abs(curr)){
                    st.pop();
                    continue;
                }
                if(Math.abs(top)==Math.abs(curr)){
                    st.pop();
                    alive = false;
                    break;
                }
                alive = false;
                break;
            }
                if(alive){
                    st.push(curr);
                }
            }
            int ans[] = new int[st.size()];
            for(int i=ans.length-1;i>=0;i--){
                ans[i]= st.pop();
            }
        return ans;
    }
}