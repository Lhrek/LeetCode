import java.util.*;

public class TopKFrequent_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        //1、构建哈希 key - count
        //2、哈希键值互换
        //3、排序 4 返回前k个值
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        HashMap<Integer,Integer> swappedMap = new HashMap<>();
        int[] res = new int[k];
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        List<Integer> sortedKeys = new ArrayList<>(swappedMap.keySet());
        Collections.sort(sortedKeys,Collections.reverseOrder());

        for(int i =0;i<k;i++){
            res[i] = swappedMap.getOrDefault(sortedKeys.get(i),0);
        }

        return res;
    }
}
