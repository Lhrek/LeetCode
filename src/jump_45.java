public class jump_45 {
    public static int jump(int[] nums) {
        int max_local = 0;
        int ans = 0;
        int end =0;
        for( int i =0;i<nums.length-1;i++){
            max_local = Math.max(max_local,nums[i]+i);

            if(i == end){
                end = max_local;
                ans++;
            }
        }
        return ans;
    }
}
