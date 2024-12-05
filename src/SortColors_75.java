public class SortColors_75 {
    public static void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length-1;
        //【0，begin） 0
        //【begin，current）1
        //(end,nums.end】 2
        for(int current = 0 ; current <= end;){
            if(nums[current] == 0 && current > begin){
               swapNums(nums,begin,current);
               begin++;
            } else if (nums[current] == 0 && current == begin) {
                begin++;
                current++;
            } else if (nums[current] ==1) {
                current++;
            }else {
                swapNums(nums,current,end);
                end--;
            }
        }

    }
    private static void swapNums(int[] nums,int i,int j){
       int tmp = nums[i];
       nums[i] = nums[j];
       nums[j] = tmp;
    }
}
