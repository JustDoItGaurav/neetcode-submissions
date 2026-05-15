class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxVolume=0;
        while(left<right){
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            maxVolume=Math.max(maxVolume,height*width);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxVolume;
    }
}
