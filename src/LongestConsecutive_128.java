import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive_128 {
    public static int longestConsecutive(int[] nums){
        /*先确定这个数是不是连续序列的第一个数 如果是，开始暴力查找确定这个序列的长度，
        * 涉及查找，就用哈希表存nums，哈希查找是否存在复杂度为O(1)*/
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        int maxlongestConsecutive = 0;
        for(int i : nums){
            if(set.contains(i-1))
                continue;
            int iter = i;
            int count = 0;
            while (set.contains(iter)){
                count ++;
                iter++;
            }
            if(count > maxlongestConsecutive){
                maxlongestConsecutive = count;
            }
        }
            return maxlongestConsecutive;

    }
}
