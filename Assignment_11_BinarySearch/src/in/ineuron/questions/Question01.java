package in.ineuron.questions;

class Solution1 {
    public int mySqrt(int x) {
        if(x <= 1) return x;

        int low = 1, mid = 1, high = x/2;

        while(low <= high){
            mid = low + (high - low)/2;

            if(mid == x/mid){
                return mid;
            } else if(mid > x/mid){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       
        return high;
        

    }
}