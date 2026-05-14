class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,ArrayList<String>> map=new HashMap<>();
      for(int i=0;i<strs.length;i++){
        char arr[]=strs[i].toCharArray();
        Arrays.sort(arr);
        String x=new String(arr);
        if(!map.containsKey(x)){
            map.put(x,new ArrayList<>());
        }
        map.get(x).add(strs[i]);
      }
      return new ArrayList<>(map.values());
    }
}
