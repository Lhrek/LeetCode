public class canPartition_416 {
    public static boolean canPartition(int[] nums) {
        //dp[]
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 1)
            return false;
        int target = sum / 2;

        //todo
        return true;

    }
}
