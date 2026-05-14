class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int productRight=1;
            int productLeft=1;
            for(int j=i-1;j>=0;j--){
                productLeft*=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                productRight*=nums[k];
            }
            result[i]=productRight*productLeft;
        }
        return result;
    }
}  
