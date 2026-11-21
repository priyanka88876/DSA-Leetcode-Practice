class Solution {
    public int search(int[] nums, int target) {

        int pivot=pivotIndex(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot);
        }else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    public int pivotIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        int n=arr.length;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=arr[n-1]){
                             end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
     public int binarySearch(int[] arr,int target,int start,int end){
        int ans=-1;
                while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    
   

    }
}