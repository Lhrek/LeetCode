import java.util.*;
public class GroupAnagrams_49 {
    public static List<List<String>> groupAnagrams(String[] strs){
        ;
        //todo java容器的操作暂时不熟 先抄一份 之后再补
        //哈希表 用排序过的字符做key
        /*遍历strs中每个str，排序后做，如果key存在，就在作为value的List后面加上这个str，
        * 如果key不存在，就创建这个key 并创建List把str加入其中*/
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
