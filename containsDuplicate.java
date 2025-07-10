class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>arr1=new HashSet<>();
        for(int num:nums){
            if (arr1.contains(num)){
                return true;
            }
            arr1.add(num);
        }
        return false;
    }
}