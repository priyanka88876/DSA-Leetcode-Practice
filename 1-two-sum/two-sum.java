class Solution {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
        int x = 0;
        int curr = 0;

        for(int i=0; i<nums.length; i++){
            curr = nums[i];
            x = target - curr;
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }
}
 
  
    