class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[] array=new int[2];
     for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   
                    array[0]=i;
                    array[1]=j;
                    return array;
               }
               
          }
     }   
     return new int[0];
    }
}
//alternate solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[] array=new int[2];
          int k;
          for(int i=0;i<nums.length;i++){
               if(nums[i]<=target){
                k=target-nums[i];
                for(int j=i+1;j<nums.length;j++){
                     if(nums[j]==k){
                          array[0]=i;
                          array[1]=j;
                          return array;
                     }
                }    
               }
              
          }
           return new int[0];
               
          }
     }   
   