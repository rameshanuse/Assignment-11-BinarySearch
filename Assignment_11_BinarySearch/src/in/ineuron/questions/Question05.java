package in.ineuron.questions;

import java.util.HashSet;
import java.util.Set;

class Solution5 {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> x=new HashSet<>();
      Set<Integer> y=new HashSet<>();
      for(int i=0;i<nums1.length;i++){
          x.add(nums1[i]);
      }
      for(int i=0;i<nums2.length;i++){
          y.add(nums2[i]);
      }
      x.retainAll(y);
      int ans[]=new int[x.size()];
      int i = 0;
        for(Integer n : x) {
            ans[i] = n;
            i++;
        }
     return ans; 
    }
}