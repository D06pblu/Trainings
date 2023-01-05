package leet.code;

import java.util.Arrays;

public class I_01 {
    public int[] twoSum(int[] nums, int target) {
        int[] j = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int k=i+1; k<nums.length; k++){
                int s=nums[i]+nums[k];
                if(target==s){
                    j[0]=i;
                    j[1]=k;
                    return j;
                }
            }
        }
        return null;
    }
}

