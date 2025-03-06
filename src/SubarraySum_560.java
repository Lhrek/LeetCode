public class SubarraySum_560 {

    // 暴力
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        for(int i =0 ;i < nums.length;i++){
            int sum = 0;
           for(int j=i;j < nums.length; j++ ){
               sum += nums[j];
               if(sum == k){
                   ans ++;
               }
           }
        }
        return ans;
    }

    //todo 非暴力
}
