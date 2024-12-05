public class ClimbStairs_70 {
    public static int climbStairs_rec(int n) {
        if(n == 1){
            return 1;
        } else if (n == 2) {
            return 2;
        }else {
            return climbStairs_rec(n-1) + climbStairs_rec(n-2);
        }
    }
    public static int climbStairs_dyn(int n) {
        int [] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        return climbStairs_dyn_helper(n,res);
    }
    private static int climbStairs_dyn_helper(int n , int[] res){
        if(n == 1)
            return res[0];
        if(n == 2)
            return res[1];
        if(res[n-1] != 0){
            return  res[n-1];
        }
        res[n-1] = climbStairs_dyn_helper(n-1,res) + climbStairs_dyn_helper(n-2,res);
        return res[n-1];
    }
}
