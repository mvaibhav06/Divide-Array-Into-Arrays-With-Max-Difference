import java.util.Arrays;

public class DivideArrays {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i=i+3){
            int p = i+1;
            int q = i+2;
            if(nums[i]-nums[p]<=k && nums[i]-nums[q]<=k && nums[p]-nums[q]<=k && nums[p]-nums[i]<=k && nums[q]-nums[p]<=k && nums[q]-nums[i]<=k){
                continue;
            }else{
                return new int[][]{};
            }
        }

        int[][] out = new int[nums.length/3][3];
        int a = 0;

        for(int i=0; i<out.length; i++){
            for(int j=0; j<3; j++){
                out[i][j] = nums[a++];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {15,13,12,13,12,14,12,2,3,13,12,14,14,13,5,12,12,2,13,2,2};
        int[][] out = divideArray(nums,2);
        for (int i=0; i<out.length; i++){
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
