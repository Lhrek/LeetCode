import java.util.Arrays;
import java.util.LinkedList;

public class merge_56 {

    //暴力模拟 用一个长数组，将区间内的置为非0，最后扫描这个数组
//    public static int[][] merge(int[][] intervals){
//
//        //第一步将intervals信息转换为一位数组
//        for(int[] interval : intervals){
//
//        }
//        //第二步 从一位数组内提取非0位转换为二位数组
//    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] inter : intervals) {
            if (merged.isEmpty() || inter[0] > merged.getLast()[1]) {
                merged.add(inter);
            } else {
                if (inter[1] > merged.getLast()[1]){
                    merged.getLast()[1] = inter[1];
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
