class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        Map <Character, Integer> freqMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            int freq = freqMap.getOrDefault(ch,0);

            freqMap.put(ch,(freq+1));
        }
        for(int i=0;i<s.length();i++){
            if(freqMap.get(s.charAt(i))==1){
                index=i;
                break;
            }
        }
        return index;
    }
}