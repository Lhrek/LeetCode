public class rotate_189 {
    public void rotate(int[] nums, int k){
        if(k == nums.length)
            return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,(k-1)%nums.length);
        reverse(nums,k%nums.length,nums.length-1);
    }
    public void reverse(int[] sub_nums,int i,int j){
        while (i < j){
            int tmp = sub_nums[i];
            sub_nums[i] = sub_nums[j];
            sub_nums[j] = tmp;
            i++;
            j--;
        }
    }
}
