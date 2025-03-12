public class canJump_55 {
    public static boolean canJump(int[] nums) {
        int max_local = 0;
        for (int i = 0; i < nums.length; i++){
            if(i > max_local) return false;
            max_local = Math.max(max_local,i+nums[i]);
        }
        return true;
    }
}
