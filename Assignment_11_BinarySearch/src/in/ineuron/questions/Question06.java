package in.ineuron.questions;

class Solution6 {
    public int findMin(int[] nums) {
        
        
        int n = nums.length;
        int flag = 0;
    
        for(int i=0; i<n-1; i++)
        {
            if(nums[i] > nums[i+1]) {
                flag = 1;
                break;
            }
        }

        if(flag == 0) {
            return nums[0];
        }
        
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;

        while(s<e) 
        {
            if(nums[0] <= nums[mid]) {
                s = mid+1;
            }
            else if(nums[0] > nums[mid]) {
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        return nums[s];
    }
}