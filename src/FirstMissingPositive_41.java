import java.util.Arrays;
public class FirstMissingPositive_41 {
    //返回缺失的一个个正数，O(n)，常数级额外空间
    //缺失的数肯定属于[1,n+1],可利用数组下标辅助
    /*题目要求我们「只能使用常数级别的空间」，而要找的数一定在 [1, N + 1] 左闭右闭（这里 N 是数组的长度）
    这个区间里。因此，我们可以就把原始的数组当做哈希表来使用。事实上，哈希表其实本身也是一个数组；
    哈希函数的规则特别简单，那就是数值为 i 的数映射到下标为 i - 1 的位置
*/
    public static int firstMissingPositive(int[] nums){
        int n = nums.length;
        int[] mark = new int[n+1];
        Arrays.fill(mark,1);
        for(int i : nums){
            if(i>=1 && i <=n+1){
                mark[i-1] = -1;
            }
        }
        for(int i =0;i<n+1;i++){
            if(mark[i] == 1){
                return i+1;
            }
        }
        return -1;
    }

}
