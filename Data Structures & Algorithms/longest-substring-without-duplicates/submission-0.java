class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int max=0;

        for(int i=0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                while(list.contains(s.charAt(i))){
                    list.remove(0);
                }
            }
            list.add(s.charAt(i));
            max=Math.max(max,list.size());
        }
        return max;
    }
}
