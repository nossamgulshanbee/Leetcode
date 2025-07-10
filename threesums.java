import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(i!=j||i!=k||j!=k){
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> output1=Arrays.asList(nums[i],nums[j],nums[k]);
                            Collections.sort(output1);
                            output.add(output1);

                        }
                    }
                }
            }
        }
        return new ArrayList(output);
    }
}