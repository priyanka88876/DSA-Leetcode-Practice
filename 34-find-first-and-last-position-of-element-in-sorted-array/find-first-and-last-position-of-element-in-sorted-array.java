class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);

        int low = 0;
        int high = nums.length - 1;

        // first occurence
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                res[0] = mid;
                high = mid - 1;
            }

            if(nums[mid] > target) high = mid - 1;
            else if (nums[mid] < target) low = mid + 1;
        }

        low = 0;
        high = nums.length - 1;

        // last occurence
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                res[1] = mid;
                low = mid + 1;
            }

            if(nums[mid] > target) high = mid - 1;
            else if (nums[mid] < target) low = mid + 1;
        }
        return res;
        
    }
}