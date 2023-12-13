package Easy;

import java.util.Arrays;

public class TwoSumProbelm {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        String result = Arrays.toString(twoSum(nums,target));

        System.out.println(result);
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
